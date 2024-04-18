package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.constants.RacingCarConstants;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }


    public int moveCar(){
        int randomNumber = Randoms.pickNumberInRange(RacingCarConstants.MOVE_MIN_NUMBER, RacingCarConstants.MOVE_MAX_NUMBER);
        if(randomNumber >= RacingCarConstants.MOVE_NUMBER){
            this.position++;
        }
        return position;
    }

}
