package racingcar.controller;

import racingcar.model.RacingGameService;

public class RacingGameController {

    public void gameStart(){
        RacingGameService racingGameService = new RacingGameService();
        racingGameService.start();
    }
}
