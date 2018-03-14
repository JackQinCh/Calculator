package calculator.simple.keys;

import calculator.simple.KeyUnOperation;
import calculator.simple.Keys;
import calculator.simple.SimpleCalcEngine;

import java.math.BigDecimal;
import java.util.function.Function;

public class KeyPercentage extends KeyUnOperation{
    public KeyPercentage(SimpleCalcEngine engine) {
        super(engine);
    }

    @Override
    protected String getSymbol() {
        return Keys.PERCENTAGE.getSymbol();
    }

    @Override
    protected Function<BigDecimal, BigDecimal> getOperation() {
        return (a) -> a.divide(new BigDecimal(100));
    }
}
