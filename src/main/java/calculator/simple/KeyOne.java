package calculator.simple;

public class KeyOne extends KeyNumber{
    public KeyOne(SimpleCalcEngine engine) {
        super(engine);
    }

    @Override
    protected String getKeyText() {
        return KeySet.ONE;
    }
}
