package com.qin.calculator.basic.keys;

import com.qin.calculator.basic.KeyBiOperation;
import com.qin.calculator.basic.Keys;
import com.qin.calculator.basic.BasicCalcEngine;

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
        return (a, b) -> a.divide(b, 8, BigDecimal.ROUND_HALF_DOWN);
    }
}
