package com.qin.calculator.basic.keys;

import com.qin.calculator.basic.KeyNumber;
import com.qin.calculator.basic.Keys;
import com.qin.calculator.basic.BasicCalcEngine;

public class KeySeven extends KeyNumber {
    public KeySeven(BasicCalcEngine engine) {
        super(engine);
    }

    @Override
    protected String getSymbol() {
        return Keys.SEVEN.getSymbol();
    }
}
