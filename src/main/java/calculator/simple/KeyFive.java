package calculator.simple;

public class KeyFive extends KeyNumber{
    public KeyFive(SimpleCalcEngine engine) {
        super(engine);
    }

    @Override
    protected String getSymbol() {
        return Keys.FIVE.getSymbol();
    }
}
