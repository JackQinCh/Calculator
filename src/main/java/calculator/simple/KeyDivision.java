package calculator.simple;

import java.math.BigDecimal;
import java.util.function.BiFunction;

public class KeyDivision extends KeyBiOperation{
    public KeyDivision(SimpleCalcEngine engine) {
        super(engine);
    }

    @Override
    protected String getSymbol() {
        return Keys.DIVISION.getSymbol();
    }

    @Override
    protected BiFunction<BigDecimal, BigDecimal, BigDecimal> getOperation() {
        return BigDecimal::divideToIntegralValue;
    }
}
