package calculator.basic.keys;

import calculator.basic.KeyBiOperation;
import calculator.basic.Keys;
import calculator.basic.BasicCalcEngine;

import java.math.BigDecimal;
import java.util.function.BiFunction;

public class KeyMultiply extends KeyBiOperation {
    public KeyMultiply(BasicCalcEngine engine) {
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
