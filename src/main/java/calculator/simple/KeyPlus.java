package calculator.simple;

import java.math.BigDecimal;
import java.util.function.BiFunction;

public class KeyPlus extends KeyBiOperation {
    
    public KeyPlus(SimpleCalcEngine engine) {
        super(engine);
    }

    protected String getSymbol() {
        return Keys.PLUS.getSymbol();
    }

    @Override
    protected BiFunction<BigDecimal, BigDecimal, BigDecimal> getOperation() {
        return BigDecimal::add;
    }
}
