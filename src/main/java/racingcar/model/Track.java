package racingcar.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import racingcar.view.TrackView;

public class Track {
    private final Map<Car, Integer> trackCountMap;
    private final List<Car> carList;
    private static Integer MAX_COUNT = 0;
    private final TrackView trackView;

    public Track(){
        trackCountMap = new HashMap<>();
        trackView = new TrackView();
        carList = new ArrayList<>();
    }

    public void addCarToTrack(Car car){
        trackCountMap.put(car, 0);
        carList.add(car);
    }

    public void printAfterAllCount(){
        trackView.printLineBreak();
    }

    public void moveCarInTrack(){
        for(Car car : carList){
            if(!trackCountMap.containsKey(car)) continue;
            randCarInTrack(car, trackCountMap.get(car));
        }
    }

    private void randCarInTrack(Car car, Integer position){
        position = car.randCarMove(position);
        trackView.printAfterRun(car, position);
        trackCountMap.put(car, position);
        MAX_COUNT = Math.max(MAX_COUNT, position);
    }

    public List<Car> findWinCar(){
        List<Car> winCars = new ArrayList<>();

        for(Map.Entry<Car, Integer> car : trackCountMap.entrySet()){
            if(car.getValue() == MAX_COUNT) winCars.add(car.getKey());
        }

        return winCars;
    }
}
