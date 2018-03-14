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
                .put(Keys.ZERO.getSymbol(), new KeyZero(engine))
                .put(Keys.ONE.getSymbol(), new KeyOne(engine))
                .put(Keys.TWO.getSymbol(), new KeyTwo(engine))
                .put(Keys.DOT.getSymbol(), new KeyDot(engine))
                .put(Keys.ADD.getSymbol(), new KeyAdd(engine))
                .put(Keys.SUBTRACT.getSymbol(), new KeySubtract(engine))
                .put(Keys.MULTIPLY.getSymbol(), new KeyMultiply(engine))
                .put(Keys.DIVISION.getSymbol(), new KeyDivision(engine))
                .build();
    }

    @NotNull
    @Override
    public Calculator pressKey(@NotNull final String key) {
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
                .pressKey(Keys.ZERO.getSymbol())
                .pressKey(Keys.ONE.getSymbol())
                .pressKey(Keys.ZERO.getSymbol())
                .pressKey(Keys.TWO.getSymbol())
                .pressKey(Keys.DOT.getSymbol())
                .pressKey(Keys.ZERO.getSymbol());

        System.out.println(calculator.getDisplay());

    }

}
