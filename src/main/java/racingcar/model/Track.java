package racingcar.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Track {
    private Map<Car, Integer> cars = new HashMap<>();
    private static Integer MAX_COUNT = 0;

    public void addCarToTrack(Car car){
        cars.put(car, 0);
    }

    public void moveCarInTrack(){
        for(Map.Entry<Car, Integer> car : cars.entrySet()){
            randCarInTrack(car.getKey(), car.getValue());
        }
    }

    private void randCarInTrack(Car car, Integer position){
        position = car.randCarMove(position);
        cars.put(car, position);
        MAX_COUNT = Math.max(MAX_COUNT, position);
    }

    public List<Car> findWinCar(){
        List<Car> winCars = new ArrayList<>();
        for(Map.Entry<Car, Integer> car : cars.entrySet()){
            if(car.getValue() == MAX_COUNT){
                winCars.add(car.getKey());
            }
        }
        return winCars;
    }
}
