package calculator.simple.keys;

import calculator.simple.KeyNumber;
import calculator.simple.Keys;
import calculator.simple.SimpleCalcEngine;

public class KeyFour extends KeyNumber {
    public KeyFour(SimpleCalcEngine engine) {
        super(engine);
    }

    @Override
    protected String getSymbol() {
        return Keys.FOUR.getSymbol();
    }
}
