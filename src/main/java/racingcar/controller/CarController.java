package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import racingcar.model.Car;

public class CarController {
    private TrackController trackController;

    public CarController(TrackController trackController) {
        this.trackController = trackController;
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
        trackController.addCar(car);
    }
}
