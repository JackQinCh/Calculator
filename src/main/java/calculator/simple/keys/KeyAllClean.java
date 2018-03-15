package calculator.simple.keys;

import calculator.Key;
import calculator.simple.SimpleCalcEngine;

public class KeyAllClean implements Key{
    protected SimpleCalcEngine engine;

    public KeyAllClean(SimpleCalcEngine engine) {
        this.engine = engine;
    }

    @Override
    public void press() {
        engine.reset();
    }
}
