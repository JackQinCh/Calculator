package calculator.basic.keys;

import calculator.basic.KeyBiOperation;
import calculator.basic.Keys;
import calculator.basic.BasicCalcEngine;

import java.math.BigDecimal;
import java.util.function.BiFunction;

public class KeyDivision extends KeyBiOperation {
    public KeyDivision(BasicCalcEngine engine) {
        super(engine);
    }

    @Override
    protected String getSymbol() {
        return Keys.DIVISION.getSymbol();
    }

    @Override
    protected BiFunction<BigDecimal, BigDecimal, BigDecimal> getOperation() {
        return BigDecimal::divide;
    }
}
