package calculator.simple;

import calculator.Key;

public class KeyZero implements Key {
    private SimpleCalcEngine engine;

    public KeyZero(SimpleCalcEngine engine) {
        this.engine = engine;
    }

    @Override
    public void press() {
        if (engine.isAppending()) {
            engine.setDisplay(engine.getDisplay() + KeySet.ZERO);
        } else {
            engine.setDisplay(KeySet.ZERO);
        }
    }
}
