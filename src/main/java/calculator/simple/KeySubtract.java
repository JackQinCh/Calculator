package calculator.simple;

import java.math.BigDecimal;
import java.util.function.BiFunction;

public class KeySubtract extends KeyBiOperation{
    public KeySubtract(SimpleCalcEngine engine) {
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
