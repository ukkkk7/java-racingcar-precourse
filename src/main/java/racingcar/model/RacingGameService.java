package racingcar.model;

import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class RacingGameService {

    private Car car;
    private RacingCars racingCars;
    private String[] carNames;

    public void start(){
        carNames = InputView.inputCarNames();
        int inputNumber = InputView.inputNumber();
        makeCars(carNames);

        for (int i = 0; i < inputNumber; i++) {
                racingCars.moveRacingCars();
                for (Car car : racingCars.getRacingCars()) {
                OutputView.printCarName(car.getName());
                OutputView.printCarPosition(car.getPosition());
                OutputView.printNextLine();
            }
            OutputView.printNextLine();
        }
        List<String> winners = racingCars.getWinnerNames(racingCars.getMaxdistance());
        OutputView.printWinner(winners);

    }

    public void makeCars(String[] carNames){
        List<Car> cars = new ArrayList<>();
        for (String car : carNames) {
            Car temporaryCar = new Car(car);
            cars.add(temporaryCar);
        }
        racingCars = new RacingCars(cars);
    }




}
