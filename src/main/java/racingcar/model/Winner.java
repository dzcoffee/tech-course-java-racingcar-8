package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class Winner {
    private List<Car> winners;
    private final Track track;

    public Winner(Track track) {
        this.track = track;
        winners = new ArrayList<>();
    }

    public void findWinner(){
        track.findWinCar();
    }
}
