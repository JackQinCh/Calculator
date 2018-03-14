package calculator.simple;

public class KeyZero extends KeyNumber {
    public KeyZero(SimpleCalcEngine engine) {
        super(engine);
    }

    @Override
    protected String getSymbol() {
        return Keys.ZERO.getSymbol();
    }
}
