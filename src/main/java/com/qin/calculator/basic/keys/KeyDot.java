package com.qin.calculator.basic.keys;

import com.qin.calculator.basic.EngineStatus;
import com.qin.calculator.basic.KeyNumber;
import com.qin.calculator.basic.Keys;
import com.qin.calculator.basic.BasicCalcEngine;

public class KeyDot extends KeyNumber {
    public KeyDot(BasicCalcEngine engine) {
        super(engine);
    }

    @Override
    public void press() {
        if (engine.getStatus() == EngineStatus.Appending) {
            if (!engine.getDisplay().contains(getSymbol())) {
                engine.setDisplay(engine.getDisplay() + getSymbol());
            }
        } else {
            engine.setDisplay(Keys.ZERO.getSymbol() + getSymbol());
            engine.setStatus(EngineStatus.Appending);
        }
    }

    @Override
    protected String getSymbol() {
        return Keys.DOT.getSymbol();
    }
}
