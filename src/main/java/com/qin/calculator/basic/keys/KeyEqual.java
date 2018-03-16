package com.qin.calculator.basic.keys;

import com.qin.calculator.Key;
import com.qin.calculator.basic.EngineStatus;
import com.qin.calculator.basic.BasicCalcEngine;

public class KeyEqual implements Key {
    protected BasicCalcEngine engine;

    public KeyEqual(BasicCalcEngine engine) {
        this.engine = engine;
    }

    @Override
    public void press() {
        engine.setStatus(EngineStatus.NewNumber);
        engine.computePreviousBiOperation();
        
        //TODO: Implement continued equal key function
    }
}
