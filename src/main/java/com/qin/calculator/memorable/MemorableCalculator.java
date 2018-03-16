package com.qin.calculator.memorable;

import com.qin.calculator.CalcEngine;
import com.qin.calculator.Calculator;
import com.qin.calculator.Key;
import com.qin.calculator.basic.Keys;
import com.qin.calculator.basic.keys.KeyZero;
import com.qin.calculator.basic.BasicCalculator;
import com.google.common.collect.ImmutableMap;

import java.util.Arrays;
import java.util.Map;

public class MemorableCalculator extends BasicCalculator {
    private final MemorableCalcEngine engine;
    private final Map<String, Key> keyMap;
    
    public MemorableCalculator() {
        this.engine = new MemorableCalcEngine();
        this.keyMap = ImmutableMap.<String, Key>builder()
                .put(Keys.ZERO.getSymbol(), new KeyZero(engine))
                .put(MemorableKeys.MEMORY_READ.getSymbol(), new KeyReadMemory(engine))
                .build();
    }

    @Override
    protected CalcEngine getEngine() {
        return engine;
    }

    @Override
    protected Map<String, Key> getKeyMap() {
        return keyMap;
    }

    public static void main(String[] args) {
        Calculator calculator = new MemorableCalculator();
        
        System.out.println(Arrays.toString(calculator.getAllKeys().toArray()));
        
        calculator.reset();
    }
}
