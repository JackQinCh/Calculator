package calculator.simple;

import calculator.CalcEngine;
import calculator.Calculator;
import calculator.Key;
import com.google.common.collect.ImmutableMap;
import com.sun.istack.internal.NotNull;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

public class SimpleCalculator implements Calculator {
    
    private final SimpleCalcEngine engine;
    private final Map<String, Key> keyMap;

    public SimpleCalculator() {
        this.engine = new SimpleCalcEngine();
        this.keyMap = ImmutableMap.<String, Key>builder()
                .put(KeySet.ZERO, new KeyZero(engine))
                .put(KeySet.ONE, new KeyOne(engine))
                .put(KeySet.TWO, new KeyTwo(engine))
                .put(KeySet.DOT, new KeyDot(engine))
                .put(KeySet.PLUS, new KeyPlus(engine))
                .build();
    }

    @NotNull
    @Override
    public Calculator press(@NotNull final String key) {
        if (!getKeyMap().containsKey(key)) {
            throw new IllegalArgumentException(String.format("Unsupported key %s.", key));
        }
        getKeyMap().get(key).press();
        return this;
    }

    @Override
    public Stream<String> getAllKeys() {
        return getKeyMap().keySet().stream();
    }

    @NotNull
    @Override
    public String getDisplay() {
        return getEngine().getDisplay();
    }

    @Override
    public Calculator reset() {
        getEngine().reset();
        return this;
    }
    
    protected CalcEngine getEngine() {
        return engine;
    }
    
    protected Map<String, Key> getKeyMap() {
        return keyMap;
    }

    public static void main(String[] args) {
        Calculator calculator = new SimpleCalculator();
        
        System.out.println(Arrays.toString(calculator.getAllKeys().toArray()));

        calculator.reset()
                .press(KeySet.ZERO)
                .press(KeySet.ONE)
                .press(KeySet.ZERO)
                .press(KeySet.TWO)
                .press(KeySet.DOT)
                .press(KeySet.ZERO);

        System.out.println(calculator.getDisplay());

    }

}
