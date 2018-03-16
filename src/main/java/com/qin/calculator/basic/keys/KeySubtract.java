package com.qin.calculator.basic.keys;

import com.qin.calculator.basic.KeyBiOperation;
import com.qin.calculator.basic.Keys;
import com.qin.calculator.basic.BasicCalcEngine;

import java.math.BigDecimal;
import java.util.function.BiFunction;

public class KeySubtract extends KeyBiOperation {
    public KeySubtract(BasicCalcEngine engine) {
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
