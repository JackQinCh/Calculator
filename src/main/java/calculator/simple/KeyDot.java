package calculator.simple;

public class KeyDot extends KeyNumber{
    public KeyDot(SimpleCalcEngine engine) {
        super(engine);
    }

    @Override
    public void press() {
        if (engine.isAppending()) {
            if (!engine.getDisplay().contains(getKeyText())) {
                engine.setDisplay(engine.getDisplay() + getKeyText());
            }
        } else {
            engine.setDisplay(Keys.ZERO + getKeyText());
            engine.setAppending(true);
        }
    }

    @Override
    protected String getKeyText() {
        return Keys.DOT.getSymbol();
    }
}
