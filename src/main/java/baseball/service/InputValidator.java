package baseball.service;

import baseball.model.BaseballNumber;

import java.util.ArrayList;
import java.util.List;

public class InputValidator {
    public List<BaseballNumber> validateNumbers(String numbers){
        List<BaseballNumber> userBaseballNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.length(); i++){
            userBaseballNumbers.add(new BaseballNumber(numbers.charAt(i)));
        }
        return userBaseballNumbers;
    }
}
