package calculator.simple;

public class KeyTwo extends KeyNumber{
    public KeyTwo(SimpleCalcEngine engine) {
        super(engine);
    }

    @Override
    protected String getKeyText() {
        return KeySet.TWO;
    }
}
