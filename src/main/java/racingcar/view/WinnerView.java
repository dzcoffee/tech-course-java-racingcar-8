package racingcar.view;

import java.util.List;
import racingcar.model.Car;
import racingcar.model.Winner;

public class WinnerView {

    public void printWinners(List<Car> winners) {
        System.out.print("최종 우승자 : ");

        int winnerSize = winners.size();
        int counter = 0;
        for (Car winner : winners) {
            winner.printCarName();
            counter++;
            if(counter < winnerSize) System.out.print(", ");
        }
    }
}
