package calculator.basic.keys;

import calculator.Key;
import calculator.basic.BasicCalcEngine;

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
