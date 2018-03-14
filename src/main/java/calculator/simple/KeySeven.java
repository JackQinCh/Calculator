package calculator.simple;

public class KeySeven extends KeyNumber{
    public KeySeven(SimpleCalcEngine engine) {
        super(engine);
    }

    @Override
    protected String getSymbol() {
        return Keys.SEVEN.getSymbol();
    }
}
