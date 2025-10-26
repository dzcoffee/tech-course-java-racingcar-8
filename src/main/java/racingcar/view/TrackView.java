package racingcar.view;

import racingcar.model.Car;

public class TrackView {

    public void printAfterRun(Car car, Integer position){
        car.printCarName();
        System.out.print(" : ");
        for(int i=0; i<position; i++){
            System.out.print("-");
        }
        System.out.print("\n");
    }

    public void printLineBreak(){
        System.out.print("\n");
    }
}
