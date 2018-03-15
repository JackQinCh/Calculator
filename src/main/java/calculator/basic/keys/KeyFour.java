package calculator.basic.keys;

import calculator.basic.KeyNumber;
import calculator.basic.Keys;
import calculator.basic.BasicCalcEngine;

public class KeyFour extends KeyNumber {
    public KeyFour(BasicCalcEngine engine) {
        super(engine);
    }

    @Override
    protected String getSymbol() {
        return Keys.FOUR.getSymbol();
    }
}
