package racingcar.validator;

import racingcar.constants.RacingCarConstants;

public class TryNumberValidator {

    public static void checkNumber(String inputNumber){
        isEmpty(inputNumber);
        isNumber(inputNumber);
        isRightNumberRange(inputNumber);
    }

    private static void isEmpty(String inputNumber){
        if(inputNumber.isEmpty()){
            throw new IllegalArgumentException(RacingCarConstants.EMPTY_VALUE_MESSAGE);
        }
    }

    private static void isNumber(String inputNumber){
        if(!inputNumber.matches("^[0-9]*$")){
            throw new IllegalArgumentException("숫자만 입력 가능합니다.");
        }
    }

    private static void isRightNumberRange(String inputNumber){
        if(Integer.parseInt(inputNumber) < RacingCarConstants.MIN_TRY_NUMBER || Integer.parseInt(inputNumber) > RacingCarConstants.MAX_TRY_NUMBER){
            throw new IllegalArgumentException("1 ~ 9까지 숫자만 입력 가능합니다.");
        }
    }



}
