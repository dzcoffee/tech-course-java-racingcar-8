package racingcar.model;

import java.util.ArrayList;
import java.util.List;
import racingcar.view.WinnerView;

public class Winner {
    private List<Car> winners;
    private final Track track;
    private final WinnerView winnerView;

    public Winner(Track track) {
        this.track = track;
        winners = new ArrayList<>();
        winnerView = new WinnerView();
    }

    public void findWinner(){
        winners.addAll(track.findWinCar());
    }

    public void printWinners(){
        winnerView.printWinners(winners);
    }

}
