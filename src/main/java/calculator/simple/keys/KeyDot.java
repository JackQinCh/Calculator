package calculator.simple.keys;

import calculator.simple.KeyNumber;
import calculator.simple.Keys;
import calculator.simple.SimpleCalcEngine;

public class KeyDot extends KeyNumber {
    public KeyDot(SimpleCalcEngine engine) {
        super(engine);
    }

    @Override
    public void press() {
        if (engine.isAppending()) {
            if (!engine.getDisplay().contains(getSymbol())) {
                engine.setDisplay(engine.getDisplay() + getSymbol());
            }
        } else {
            engine.setDisplay(Keys.ZERO.getSymbol() + getSymbol());
            engine.setAppending(true);
        }
    }

    @Override
    protected String getSymbol() {
        return Keys.DOT.getSymbol();
    }
}
