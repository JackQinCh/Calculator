package calculator.simple;

public class KeyZero extends KeyNumber {
    public KeyZero(SimpleCalcEngine engine) {
        super(engine);
    }

    @Override
    public void press() {
        if (engine.isAppending()) {
            engine.setDisplay(engine.getDisplay() + getSymbol());
        } else {
            engine.setDisplay(getSymbol());
        }
    }

    @Override
    protected String getSymbol() {
        return Keys.ZERO.getSymbol();
    }
}
