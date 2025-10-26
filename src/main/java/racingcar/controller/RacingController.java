package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;
import racingcar.model.Race;
import racingcar.view.RacingView;

public class RacingController {
    private RacingView racingView;
    private Race race;
    private CarController carController;
    private static Integer TRACK_COUNT;

    public RacingController(Race race, RacingView racingView, CarController carController) {
        this.race = race;
        this.racingView = racingView;
        this.carController = carController;
    }

    public void start() {
        racingView.printBeforeInputCar();
        carController.inputCar();
        racingView.printBeforeInputCount();
        TRACK_COUNT = createCount();
    }

    private Integer createCount() {
        String input = Console.readLine();
        try{
            return Integer.parseInt(input);
        }
        catch (IllegalArgumentException e) {
            throw e;
        }
    }
}
