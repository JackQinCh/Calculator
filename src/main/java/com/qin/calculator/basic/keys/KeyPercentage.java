package com.qin.calculator.basic.keys;

import com.qin.calculator.basic.KeyUnOperation;
import com.qin.calculator.basic.Keys;
import com.qin.calculator.basic.BasicCalcEngine;

import java.math.BigDecimal;
import java.util.function.Function;

public class KeyPercentage extends KeyUnOperation{
    public KeyPercentage(BasicCalcEngine engine) {
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
