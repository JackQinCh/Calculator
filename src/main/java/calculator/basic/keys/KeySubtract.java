package calculator.basic.keys;

import calculator.basic.KeyBiOperation;
import calculator.basic.Keys;
import calculator.basic.BasicCalcEngine;

import java.math.BigDecimal;
import java.util.function.BiFunction;

public class KeySubtract extends KeyBiOperation {
    public KeySubtract(BasicCalcEngine engine) {
        super(engine);
    }

    protected String getSymbol() {
        return Keys.SUBTRACT.getSymbol();
    }

    @Override
    protected BiFunction<BigDecimal, BigDecimal, BigDecimal> getOperation() {
        return BigDecimal::subtract;
    }
}
