package racingcar;

import racingcar.controller.CarController;
import racingcar.controller.RacingController;
import racingcar.model.Race;
import racingcar.view.RacingView;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Race race = new Race();
        RacingView racingView = new RacingView();
        CarController carController = new CarController();
        RacingController racingController = new RacingController(race, racingView, carController);

        racingController.start();

    }
}
