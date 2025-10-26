package racingcar;

import racingcar.controller.CarController;
import racingcar.controller.RacingController;
import racingcar.controller.TrackController;
import racingcar.model.Track;
import racingcar.view.RacingView;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Track track = new Track();

        RacingView racingView = new RacingView();

        TrackController trackController = new TrackController(track);
        CarController carController = new CarController(trackController);
        RacingController racingController = new RacingController(track, racingView, carController, trackController);

        racingController.start();

    }
}
