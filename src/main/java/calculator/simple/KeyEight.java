package calculator.simple;

public class KeyEight extends KeyNumber{
    public KeyEight(SimpleCalcEngine engine) {
        super(engine);
    }

    @Override
    protected String getSymbol() {
        return Keys.EIGHT.getSymbol();
    }
}
