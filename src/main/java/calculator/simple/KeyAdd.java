package calculator.simple;

import java.math.BigDecimal;
import java.util.function.BiFunction;

public class KeyAdd extends KeyBiOperation {
    
    public KeyAdd(SimpleCalcEngine engine) {
        super(engine);
    }

    protected String getSymbol() {
        return Keys.ADD.getSymbol();
    }

    @Override
    protected BiFunction<BigDecimal, BigDecimal, BigDecimal> getOperation() {
        return BigDecimal::add;
    }
}
