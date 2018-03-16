package com.qin.calculator.basic;

import com.qin.calculator.Key;

import java.math.BigDecimal;
import java.util.function.BiFunction;

public abstract class KeyBiOperation implements Key {
    protected BasicCalcEngine engine;

    public KeyBiOperation(BasicCalcEngine engine) {
        this.engine = engine;
    }

    @Override
    public void press() {
        if (engine.getStatus() != EngineStatus.BiOperation) {
            engine.setStatus(EngineStatus.BiOperation);
            engine.computePreviousBiOperation();
            BigDecimal current = engine.getCurrentNumber();
            engine.getNumberStack().push(current);
            engine.getBiOperationStack().push(getOperation());
        } else {
            if (!engine.getBiOperationStack().isEmpty()) {
                engine.getBiOperationStack().pop();
                engine.getBiOperationStack().push(getOperation());
            }
        }
    }

    protected abstract String getSymbol();

    protected abstract BiFunction<BigDecimal, BigDecimal, BigDecimal> getOperation();
}
