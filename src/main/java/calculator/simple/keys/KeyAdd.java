package calculator.simple.keys;

import calculator.simple.KeyBiOperation;
import calculator.simple.Keys;
import calculator.simple.SimpleCalcEngine;

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
