package calculator.basic.keys;

import calculator.basic.KeyNumber;
import calculator.basic.Keys;
import calculator.basic.BasicCalcEngine;

public class KeyFive extends KeyNumber {
    public KeyFive(BasicCalcEngine engine) {
        super(engine);
    }

    @Override
    protected String getSymbol() {
        return Keys.FIVE.getSymbol();
    }
}
