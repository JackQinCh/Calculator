package com.qin.calculator.basic.keys;

import com.qin.calculator.Key;
import com.qin.calculator.basic.EngineStatus;
import com.qin.calculator.basic.BasicCalcEngine;

import java.math.BigDecimal;

public class KeySignum implements Key{
    protected BasicCalcEngine engine;
    
    public KeySignum(BasicCalcEngine engine) {
        this.engine = engine;
    }

    @Override
    public void press() {
        engine.setStatus(EngineStatus.NewNumber);
        BigDecimal newNumber = engine.getCurrentNumber().negate();
        engine.setDisplay(newNumber.toString());
    }
    
    private boolean isNegative(BigDecimal number) {
        return number.signum() == -1;
    }
}
