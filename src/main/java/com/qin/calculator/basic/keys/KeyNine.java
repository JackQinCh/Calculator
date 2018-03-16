package com.qin.calculator.basic.keys;

import com.qin.calculator.basic.KeyNumber;
import com.qin.calculator.basic.Keys;
import com.qin.calculator.basic.BasicCalcEngine;

public class KeyNine extends KeyNumber {
    public KeyNine(BasicCalcEngine engine) {
        super(engine);
    }

    @Override
    protected String getSymbol() {
        return Keys.NINE.getSymbol();
    }
}
