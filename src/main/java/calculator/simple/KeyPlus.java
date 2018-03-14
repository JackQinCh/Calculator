package calculator.simple;

import calculator.Key;

import java.math.BigDecimal;
import java.util.function.BiFunction;

public class KeyPlus implements Key {
    protected SimpleCalcEngine engine;

    public KeyPlus(SimpleCalcEngine engine) {
        this.engine = engine;
    }

    private BiFunction<BigDecimal, BigDecimal, BigDecimal> operation = BigDecimal::add;

    @Override
    public void press() {
        if (engine.isAppending()) {
            engine.setAppending(false);
            computePreviousOperation(engine);
            BigDecimal current = new BigDecimal(Long.valueOf(engine.getDisplay()));
            engine.getNumberStack().push(current);
            engine.getBiOperationStack().push(operation);
        } else {
            engine.getBiOperationStack().pop();
            engine.getBiOperationStack().push(operation);
        }
    }

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
    
    protected String getSymbol() {
        return Keys.PLUS.getSymbol();
    }
}
