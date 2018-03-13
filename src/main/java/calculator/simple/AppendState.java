package calculator.simple;

import calculator.Key;

public class AppendState implements State{
    private final SimpleCalculator calculator;

    public AppendState(SimpleCalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void press(Key key) {

    }
}
