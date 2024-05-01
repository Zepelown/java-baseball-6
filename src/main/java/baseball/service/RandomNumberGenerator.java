package baseball.service;

import baseball.model.BaseballNumber;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class RandomNumberGenerator {

    private final int MAX_NUMBER = 9;
    private final int MIN_NUMBER = 1;

    private final int BASEBALL_NUMBER_SIZE = 3;

    public List<BaseballNumber> generateRandomNumber() {
        List<BaseballNumber> randomNumbers = new ArrayList<>();
        while (randomNumbers.size() < BASEBALL_NUMBER_SIZE) {
            int randomNumber = Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);
            if (!randomNumbers.contains(randomNumber)) {
                randomNumbers.add(new BaseballNumber(randomNumber));
            }
        }
        return randomNumbers;
    }
}
