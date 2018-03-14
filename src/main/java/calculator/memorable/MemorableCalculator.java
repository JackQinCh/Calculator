package calculator.memorable;

import calculator.CalcEngine;
import calculator.Calculator;
import calculator.Key;
import calculator.simple.KeyZero;
import calculator.simple.SimpleCalculator;
import com.google.common.collect.ImmutableMap;

import java.util.Arrays;
import java.util.Map;

public class MemorableCalculator extends SimpleCalculator {
    private final MemorableCalcEngine engine;
    private final Map<String, Key> keyMap;
    
    public MemorableCalculator() {
        this.engine = new MemorableCalcEngine();
        this.keyMap = ImmutableMap.<String, Key>builder()
                .put(MemorableKeySet.ZERO, new KeyZero(engine))
                .put(MemorableKeySet.MEMORY_READ, new KeyReadMemory(engine))
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
