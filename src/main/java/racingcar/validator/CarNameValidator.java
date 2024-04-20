package racingcar.validator;

import racingcar.constants.RacingCarConstants;

import java.util.Arrays;

public class CarNameValidator {

    public static void checkCarName(String[] carNames){
        isDulicatedName(carNames);
        isCarCountUpperTwo(carNames);
        isRightNameLength(carNames);
        isEmpty(carNames);
    }

    private static void isDulicatedName(String[] carNames){
        if(carNames.length != Arrays.stream(carNames).distinct().count()){
            throw new IllegalArgumentException("중복된 이름은 입력할 수 없습니다.");
        }
    }
    private static void isEmpty(String[] carNames){
        for (String carName : carNames) {
            if(carName.contains(" ")){
                throw new IllegalArgumentException(RacingCarConstants.EMPTY_VALUE_MESSAGE);
            }
        }
    }
    private static void isRightNameLength(String[] carNames){
        for (String carName : carNames) {
            if(carName.length() < RacingCarConstants.MIN_CAR_NAME_LENGTH || carName.length() > RacingCarConstants.MAX_CAR_NAME_LENGTH){
                throw new IllegalArgumentException("이름은 1이상 5이하로 입력해야 합니다.");
            }
        }
    }
    private static void isCarCountUpperTwo(String[] carNames){
        if(carNames.length < RacingCarConstants.MIN_CAR_COUNT){
            throw new IllegalArgumentException("자동차는 2개이상 입력해야 합니다.");
        }
    }





}
