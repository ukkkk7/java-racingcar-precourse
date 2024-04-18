package racingcar.model;

import racingcar.view.InputView;

import java.util.ArrayList;
import java.util.List;

public class RacingGameService {

    public void gameStart(){
        String[] carNames = InputView.inputCarNames();
        int inputNumber = InputView.inputNumber();

        for (int i = 0; i < inputNumber; i++) {
            for (String carName : carNames) {
                Car car = new Car(carName);
                car.moveCar();
            }
        }

    }


}