package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;
import racingcar.model.Car;
import racingcar.model.Track;

public class CarController {
    private final Track track;

    public CarController(){
        track = new Track();
    }

    public void inputCar(){
        String carInput = Console.readLine();
        String[] carArray = carInput.split(",");
        for(String carName : carArray){
            createCar(carName);
        }
    }

    private void createCar(String carName){
        Car car = new Car(carName);
        track.addCarToTrack(car);
    }
}
