package racingcar.controller;

import racingcar.model.Car;
import racingcar.model.Track;

public class TrackController {
    private final Track track;

    public TrackController(Track track) {
        this.track = track;
    }

    public void run(Integer count){
        for(int i = 0; i < count; i++){
            track.moveCarInTrack();
        }
    }

    public void addCar(Car car){
        track.addCarToTrack(car);
    }

}
