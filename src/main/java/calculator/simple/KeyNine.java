package calculator.simple;

public class KeyNine extends KeyNumber{
    public KeyNine(SimpleCalcEngine engine) {
        super(engine);
    }

    @Override
    protected String getSymbol() {
        return Keys.NINE.getSymbol();
    }
}
