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
            computePreviousOperation(engine);
            BigDecimal current = new BigDecimal(Long.valueOf(engine.getDisplay()));
            engine.getNumberStack().push(current);
            engine.getBiOperationStack().push(getOperation());
        } else {
            engine.getBiOperationStack().pop();
            engine.getBiOperationStack().push(getOperation());
        }
    }

    protected abstract String getSymbol();

    protected abstract BiFunction<BigDecimal, BigDecimal, BigDecimal> getOperation();

    private void computePreviousOperation(SimpleCalcEngine engine) {
        if (engine.getBiOperationStack().isEmpty()) {
            return;
        }

        BiFunction<BigDecimal, BigDecimal, BigDecimal> previousOperation =
                engine.getBiOperationStack().pop();

        BigDecimal current = new BigDecimal(Long.valueOf(engine.getDisplay()));
        BigDecimal previous = engine.getNumberStack().pop();
        BigDecimal result = previousOperation.apply(previous, current);
        engine.setDisplay(result.toString());
    }
}
