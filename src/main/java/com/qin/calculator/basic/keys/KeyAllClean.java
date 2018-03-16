package com.qin.calculator.basic.keys;

import com.qin.calculator.Key;
import com.qin.calculator.basic.BasicCalcEngine;

public class KeyAllClean implements Key{
    protected BasicCalcEngine engine;

    public KeyAllClean(BasicCalcEngine engine) {
        this.engine = engine;
    }

    @Override
    public void press() {
        engine.reset();
    }
}
