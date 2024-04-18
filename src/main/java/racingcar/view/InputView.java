package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.validator.CarNameValidator;
import racingcar.validator.TryNumberValidator;

public class InputView {

    public static String[] inputCarNames(){
        while (true) {
            System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
            try {
                String carName = Console.readLine();
                String[] carNames = carName.split(",");
                CarNameValidator.checkCarName(carNames);
                return carNames;
            } catch (IllegalArgumentException e) {
                OutputView.printError(e.getMessage());
            }
        }
    }

    public static int inputNumber(){
        while (true){
            System.out.println("시도할 회수는 몇회인가요?");
            try{
                String inputNumber = Console.readLine();
                TryNumberValidator.checkNumber(inputNumber);
                return Integer.parseInt(inputNumber);
            }catch (IllegalArgumentException e){
                OutputView.printError(e.getMessage());
            }
        }
    }




}
