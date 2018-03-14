package calculator.simple.keys;

import calculator.simple.KeyNumber;
import calculator.simple.Keys;
import calculator.simple.SimpleCalcEngine;

public class KeyEight extends KeyNumber {
    public KeyEight(SimpleCalcEngine engine) {
        super(engine);
    }

    @Override
    protected String getSymbol() {
        return Keys.EIGHT.getSymbol();
    }
}