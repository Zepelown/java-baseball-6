package baseball.model;

import java.util.List;

public class OpponentBaseBallNumbers {

    private List<BaseballNumber> opponentBaseballNumbers;
    public OpponentBaseBallNumbers(List<BaseballNumber> opponentBaseballNumbers) {
        this.opponentBaseballNumbers = opponentBaseballNumbers;
    }

    public BaseballGameResult compareBetweenUserBaseballNumbers(List<BaseballNumber> userBaseballNumbers){
        int ballCount = 0;
        int strikeCount = 0;
        for (int i = 0; i < userBaseballNumbers.size(); i++){
            if (userBaseballNumbers.get(i) == opponentBaseballNumbers.get(i)){
                strikeCount++;
                continue;
            }
            if (opponentBaseballNumbers.contains(userBaseballNumbers.get(i))){
                ballCount++;
            }
        }
        return new BaseballGameResult(ballCount,strikeCount);
    }
}
