package calculator.simple;

public class KeyThree extends KeyNumber{
    public KeyThree(SimpleCalcEngine engine) {
        super(engine);
    }

    @Override
    protected String getSymbol() {
        return Keys.THREE.getSymbol();
    }
}
