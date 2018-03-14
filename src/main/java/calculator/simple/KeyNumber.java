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
            engine.setDisplay(engine.getDisplay() + getSymbol());
        } else {
            engine.setDisplay(getSymbol());
            engine.setAppending(true);
        }
    }

    abstract protected String getSymbol();
}
