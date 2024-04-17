package racingcar.validator;

public class TryNumberValidator {

    private static void isEmpty(String inputNumber){
        if(inputNumber.isEmpty()){
            throw new IllegalArgumentException("빈 값은 입력할 수 없습니다.");
        }
    }

    private static void isNumber(String inputNumber){
        if(!inputNumber.matches("^[0-9]*$")){
            throw new IllegalArgumentException("숫자만 입력 가능합니다.");
        }
    }

    private static void isUpperZero(String inputNumber){
        if(Integer.parseInt(inputNumber) <= 0){
            throw new IllegalArgumentException("1이상의 숫자만 입력 가능합니다.");
        }
    }



}
