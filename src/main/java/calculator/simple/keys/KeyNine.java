package calculator.simple.keys;

import calculator.simple.KeyNumber;
import calculator.simple.Keys;
import calculator.simple.SimpleCalcEngine;

public class KeyNine extends KeyNumber {
    public KeyNine(SimpleCalcEngine engine) {
        super(engine);
    }

    @Override
    protected String getSymbol() {
        return Keys.NINE.getSymbol();
    }
}
