package com.qin.calculator.basic.keys;

import com.qin.calculator.basic.KeyNumber;
import com.qin.calculator.basic.Keys;
import com.qin.calculator.basic.BasicCalcEngine;

public class KeyFive extends KeyNumber {
    public KeyFive(BasicCalcEngine engine) {
        super(engine);
    }

    @Override
    protected String getSymbol() {
        return Keys.FIVE.getSymbol();
    }
}
