package racingcar.model;

import java.util.HashMap;
import java.util.Map;

public class Track {
    Map<Car, Integer> cars = new HashMap<>();

    public void addCarToTrack(Car car){
        cars.put(car, 0);
    }
}
