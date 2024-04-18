package racingcar.validator;

public class TryNumberValidator {

    public static void checkNumber(String inputNumber){
        isEmpty(inputNumber);
        isNumber(inputNumber);
        isRightNumberRange(inputNumber);
    }

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

    private static void isRightNumberRange(String inputNumber){
        if(Integer.parseInt(inputNumber) <= 0 || Integer.parseInt(inputNumber) > 9){
            throw new IllegalArgumentException("1 ~ 9까지 숫자만 입력 가능합니다.");
        }
    }



}
