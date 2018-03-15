package calculator.basic;

import calculator.Key;

import java.math.BigDecimal;
import java.util.function.Function;

/**
 * Unitary operation key
 */
public abstract class KeyUnOperation implements Key{
    protected BasicCalcEngine engine;

    public KeyUnOperation(BasicCalcEngine engine) {
        this.engine = engine;
    }

    @Override
    public void press() {
        engine.setStatus(EngineStatus.NewNumber);
        computeOperation(engine);
    }

    protected abstract String getSymbol();

    protected abstract Function<BigDecimal, BigDecimal> getOperation();
    
    private void computeOperation(BasicCalcEngine engine) {
        BigDecimal current = engine.getCurrentNumber();
        BigDecimal result = getOperation().apply(current);
        engine.setDisplay(result.toString());
    }
}
