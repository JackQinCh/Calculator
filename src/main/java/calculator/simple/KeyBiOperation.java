package calculator.simple;

import calculator.Key;

import java.math.BigDecimal;
import java.util.function.BiFunction;

public abstract class KeyBiOperation implements Key {
    protected SimpleCalcEngine engine;

    public KeyBiOperation(SimpleCalcEngine engine) {
        this.engine = engine;
    }

    @Override
    public void press() {
        if (engine.isAppending()) {
            engine.setAppending(false);
            engine.computePreviousBiOperation();
            BigDecimal current = engine.getCurrentNumber();
            engine.getNumberStack().push(current);
            engine.getBiOperationStack().push(getOperation());
        } else {
            if (!engine.getBiOperationStack().isEmpty()) {
                engine.getBiOperationStack().pop();
            }
            engine.getBiOperationStack().push(getOperation());
        }
    }

    protected abstract String getSymbol();

    protected abstract BiFunction<BigDecimal, BigDecimal, BigDecimal> getOperation();
}
