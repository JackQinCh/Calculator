package calculator.simple.keys;

import calculator.simple.KeyBiOperation;
import calculator.simple.Keys;
import calculator.simple.SimpleCalcEngine;

import java.math.BigDecimal;
import java.util.function.BiFunction;

public class KeyMultiply extends KeyBiOperation {
    public KeyMultiply(SimpleCalcEngine engine) {
        super(engine);
    }

    @Override
    protected String getSymbol() {
        return Keys.MULTIPLY.getSymbol();
    }

    @Override
    protected BiFunction<BigDecimal, BigDecimal, BigDecimal> getOperation() {
        return BigDecimal::multiply;
    }
}
