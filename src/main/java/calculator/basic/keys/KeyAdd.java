package calculator.basic.keys;

import calculator.basic.KeyBiOperation;
import calculator.basic.Keys;
import calculator.basic.BasicCalcEngine;

import java.math.BigDecimal;
import java.util.function.BiFunction;

public class KeyAdd extends KeyBiOperation {
    
    public KeyAdd(BasicCalcEngine engine) {
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
