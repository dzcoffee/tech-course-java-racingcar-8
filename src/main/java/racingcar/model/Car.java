package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private String carName;

    public Car(String carName) {
        this.carName = carName;
    }

    public Integer randCarMove(Integer nowPosition){
        if(Randoms.pickNumberInRange(0, 9) >=4) return nowPosition+1;
        return nowPosition;
    }

    public void printCarName(){
        System.out.print(carName);
    }
}
