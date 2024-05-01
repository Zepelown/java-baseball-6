package baseball.model;

import baseball.service.RandomNumberGenerator;

public class BaseballGame {
    private RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
    private OpponentBaseBallNumbers opponentBaseBallNumbers;

    public BaseballGame(){
    }


    public void setOpponentBall(){
        opponentBaseBallNumbers = new OpponentBaseBallNumbers(randomNumberGenerator.generateRandomNumber());
    }
}
