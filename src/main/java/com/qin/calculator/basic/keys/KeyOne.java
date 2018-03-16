package com.qin.calculator.basic.keys;

import com.qin.calculator.basic.KeyNumber;
import com.qin.calculator.basic.Keys;
import com.qin.calculator.basic.BasicCalcEngine;

public class KeyOne extends KeyNumber {
    public KeyOne(BasicCalcEngine engine) {
        super(engine);
    }

    @Override
    protected String getSymbol() {
        return Keys.ONE.getSymbol();
    }
}
