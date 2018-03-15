package calculator.basic.keys;

import calculator.basic.KeyNumber;
import calculator.basic.Keys;
import calculator.basic.BasicCalcEngine;

public class KeyTwo extends KeyNumber {
    public KeyTwo(BasicCalcEngine engine) {
        super(engine);
    }

    @Override
    protected String getSymbol() {
        return Keys.TWO.getSymbol();
    }
}
