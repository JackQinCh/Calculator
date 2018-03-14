package calculator.simple;

public class KeyZero extends KeyNumber {
    public KeyZero(SimpleCalcEngine engine) {
        super(engine);
    }

    @Override
    public void press() {
        if (engine.isAppending()) {
            engine.setDisplay(engine.getDisplay() + getKeyText());
        } else {
            engine.setDisplay(getKeyText());
        }
    }

    @Override
    protected String getKeyText() {
        return KeySet.ZERO;
    }
}
