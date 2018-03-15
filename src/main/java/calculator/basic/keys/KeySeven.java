package calculator.basic.keys;

import calculator.basic.KeyNumber;
import calculator.basic.Keys;
import calculator.basic.BasicCalcEngine;

public class KeySeven extends KeyNumber {
    public KeySeven(BasicCalcEngine engine) {
        super(engine);
    }

    @Override
    protected String getSymbol() {
        return Keys.SEVEN.getSymbol();
    }
}
