package calculator.simple;

import calculator.Key;

public abstract class KeyNumber implements Key {
    protected SimpleCalcEngine engine;

    public KeyNumber(SimpleCalcEngine engine) {
        this.engine = engine;
    }

    @Override
    public void press() {
        if (engine.isAppending()) {
            engine.setDisplay(engine.getDisplay() + getKeyText());
        } else {
            engine.setDisplay(getKeyText());
            engine.setAppending(true);
        }
    }

    abstract protected String getKeyText();
}
