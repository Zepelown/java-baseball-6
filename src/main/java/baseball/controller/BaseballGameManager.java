package baseball.controller;

import baseball.model.BaseballGame;
import baseball.model.OpponentBaseBallNumbers;
import baseball.service.InputValidator;
import baseball.service.RandomNumberGenerator;
import baseball.view.InputView;
import baseball.view.OutputView;

import java.io.IOException;

public class BaseballGameManager {
    private BaseballGame baseballGame = new BaseballGame();
    private InputView inputView = new InputView();

    private InputValidator inputValidator = new InputValidator();
    private OutputView outputView = new OutputView();

    public BaseballGameManager() {
        startGame();
    }

    public void startGame() {
        outputView.printStartMessage();
        readUserBaseballNumbers();
    }
    public void readUserBaseballNumbers() {
        try {
            inputValidator.validateNumbers(inputView.readNumbers());
        } catch (IllegalStateException e) {
            System.out.println("잘못된 입력입니다.");
            readUserBaseballNumbers();
        }
    }


}
