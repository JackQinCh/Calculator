package calculator.basic.keys;

import calculator.basic.KeyNumber;
import calculator.basic.Keys;
import calculator.basic.BasicCalcEngine;

public class KeyNine extends KeyNumber {
    public KeyNine(BasicCalcEngine engine) {
        super(engine);
    }

    @Override
    protected String getSymbol() {
        return Keys.NINE.getSymbol();
    }
}
