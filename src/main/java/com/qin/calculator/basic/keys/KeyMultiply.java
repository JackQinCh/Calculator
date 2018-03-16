package com.qin.calculator.basic.keys;

import com.qin.calculator.basic.KeyBiOperation;
import com.qin.calculator.basic.Keys;
import com.qin.calculator.basic.BasicCalcEngine;

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
