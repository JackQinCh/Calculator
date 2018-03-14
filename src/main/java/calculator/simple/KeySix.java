package calculator.simple;

public class KeySix extends KeyNumber{
    public KeySix(SimpleCalcEngine engine) {
        super(engine);
    }

    @Override
    protected String getSymbol() {
        return Keys.SIX.getSymbol();
    }
}
