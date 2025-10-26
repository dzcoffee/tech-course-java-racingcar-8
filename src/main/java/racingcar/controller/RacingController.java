package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;
import racingcar.model.Track;
import racingcar.model.Winner;
import racingcar.view.RacingView;

public class RacingController {
    private final RacingView racingView;
    private final CarController carController;
    private final TrackController trackController;
    private static Integer TRACK_COUNT;
    private final Track track;
    private final Winner winner;

    public RacingController(Track track, RacingView racingView, CarController carController, TrackController trackController) {
        this.racingView = racingView;
        this.trackController = trackController;
        this.carController = carController;
        this.track = track;
        this.winner = new Winner(track);

    }

    public void start() {
        racingView.printBeforeInputCar();
        carController.inputCar();
        racingView.printBeforeInputCount();
        TRACK_COUNT = createCount();

        racingView.printBeforeRun();
        trackController.run(TRACK_COUNT);
        winner.findWinner();
        winner.printWinners();
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
