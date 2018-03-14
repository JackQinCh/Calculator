package calculator.simple;

public class KeyFour extends KeyNumber{
    public KeyFour(SimpleCalcEngine engine) {
        super(engine);
    }

    @Override
    protected String getSymbol() {
        return Keys.FOUR.getSymbol();
    }
}
