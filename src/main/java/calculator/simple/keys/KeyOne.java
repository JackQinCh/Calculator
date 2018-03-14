package calculator.simple.keys;

import calculator.simple.KeyNumber;
import calculator.simple.Keys;
import calculator.simple.SimpleCalcEngine;

public class KeyOne extends KeyNumber {
    public KeyOne(SimpleCalcEngine engine) {
        super(engine);
    }

    @Override
    protected String getSymbol() {
        return Keys.ONE.getSymbol();
    }
}
