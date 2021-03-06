package com.qin.calculator.basic;

import com.qin.calculator.Key;
import org.apache.commons.lang3.StringUtils;

public abstract class KeyNumber implements Key {
    protected BasicCalcEngine engine;

    public KeyNumber(BasicCalcEngine engine) {
        this.engine = engine;
    }

    @Override
    public void press() {
        if (engine.getStatus() == EngineStatus.Appending) {
            if (StringUtils.equals(Keys.ZERO.getSymbol(), engine.getDisplay())) {
                engine.setDisplay(getSymbol());
            } else {
                engine.setDisplay(engine.getDisplay() + getSymbol());
            }
        } else {
            engine.setDisplay(getSymbol());
            engine.setStatus(EngineStatus.Appending);
        }
    }

    abstract protected String getSymbol();
}
