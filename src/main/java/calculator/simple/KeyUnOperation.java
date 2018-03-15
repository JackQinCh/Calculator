package calculator.simple;

import calculator.Key;

import java.math.BigDecimal;
import java.util.function.Function;

/**
 * Unitary operation key
 */
public abstract class KeyUnOperation implements Key{
    protected SimpleCalcEngine engine;

    public KeyUnOperation(SimpleCalcEngine engine) {
        this.engine = engine;
    }

    @Override
    public void press() {
        engine.setStatus(EngineStatus.NewNumber);
        computeOperation(engine);
    }

    protected abstract String getSymbol();

    protected abstract Function<BigDecimal, BigDecimal> getOperation();
    
    private void computeOperation(SimpleCalcEngine engine) {
        BigDecimal current = engine.getCurrentNumber();
        BigDecimal result = getOperation().apply(current);
        engine.setDisplay(result.toString());
    }
}
