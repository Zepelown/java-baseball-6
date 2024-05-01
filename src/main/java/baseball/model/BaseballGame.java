package baseball.model;

import baseball.service.RandomNumberGenerator;

import java.util.List;

public class BaseballGame {
    private RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
    private OpponentBaseBallNumbers opponentBaseBallNumbers = setOpponentBall();

    public BaseballGameResult isEnd(List<BaseballNumber> userBaseballNumbers){
        return opponentBaseBallNumbers.compareBetweenUserBaseballNumbers(userBaseballNumbers);
    }

    private OpponentBaseBallNumbers setOpponentBall(){
        return opponentBaseBallNumbers = new OpponentBaseBallNumbers(randomNumberGenerator.generateRandomNumber());
    }
}
