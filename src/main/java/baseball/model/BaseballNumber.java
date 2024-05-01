package baseball.model;

public class BaseballNumber {

    private static final int MAX_NUMBER = 57;
    private static final int MIN_NUMBER = 48;
    private int baseballNumber;
    public BaseballNumber(int baseballNumber){
        validate(baseballNumber);
        this.baseballNumber = baseballNumber;
    }

    public int getBaseballNumber() {
        return baseballNumber;
    }

    private void validate(int baseballNumber){
        if (baseballNumber >= MIN_NUMBER && baseballNumber <=  MAX_NUMBER){
            return;
        }
        throw new IllegalStateException();
    }
}
