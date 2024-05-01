package baseball.controller;

import baseball.model.BaseballGame;
import baseball.model.BaseballGameResult;
import baseball.model.BaseballNumber;
import baseball.model.OpponentBaseBallNumbers;
import baseball.service.InputValidator;
import baseball.service.RandomNumberGenerator;
import baseball.view.InputView;
import baseball.view.OutputView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BaseballGameManager {
    private BaseballGame baseballGame = new BaseballGame();
    private InputView inputView = new InputView();

    private InputValidator inputValidator = new InputValidator();
    private OutputView outputView = new OutputView();

    public BaseballGameManager() {
        startGame();
    }

    public void startGame() {
        BaseballGameResult baseballGameResult = new BaseballGameResult(0,0);
        outputView.printStartMessage();
        do {
            readUserBaseballNumbers();
        } while(!baseballGameResult.isWin());
    }
    public List<BaseballNumber> readUserBaseballNumbers() {
        List<BaseballNumber> userBaseballNumbers = new ArrayList<>();
        try {
            userBaseballNumbers = inputValidator.validateNumbers(inputView.readNumbers());
        } catch (IllegalStateException e) {
            System.out.println("잘못된 입력입니다.");
            readUserBaseballNumbers();
        }
        return userBaseballNumbers;
    }
}
