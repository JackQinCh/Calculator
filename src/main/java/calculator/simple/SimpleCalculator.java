package calculator.simple;

import calculator.CalcEngine;
import calculator.Calculator;
import calculator.Key;
import calculator.simple.keys.KeyAdd;
import calculator.simple.keys.KeyDivision;
import calculator.simple.keys.KeyDot;
import calculator.simple.keys.KeyEight;
import calculator.simple.keys.KeyFive;
import calculator.simple.keys.KeyFour;
import calculator.simple.keys.KeyMultiply;
import calculator.simple.keys.KeyNine;
import calculator.simple.keys.KeyOne;
import calculator.simple.keys.KeyPercentage;
import calculator.simple.keys.KeySeven;
import calculator.simple.keys.KeySix;
import calculator.simple.keys.KeySubtract;
import calculator.simple.keys.KeyThree;
import calculator.simple.keys.KeyTwo;
import calculator.simple.keys.KeyZero;
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
                .put(Keys.THREE.getSymbol(), new KeyThree(engine))
                .put(Keys.FOUR.getSymbol(), new KeyFour(engine))
                .put(Keys.FIVE.getSymbol(), new KeyFive(engine))
                .put(Keys.SIX.getSymbol(), new KeySix(engine))
                .put(Keys.SEVEN.getSymbol(), new KeySeven(engine))
                .put(Keys.EIGHT.getSymbol(), new KeyEight(engine))
                .put(Keys.NINE.getSymbol(), new KeyNine(engine))
                .put(Keys.DOT.getSymbol(), new KeyDot(engine))
                .put(Keys.ADD.getSymbol(), new KeyAdd(engine))
                .put(Keys.SUBTRACT.getSymbol(), new KeySubtract(engine))
                .put(Keys.MULTIPLY.getSymbol(), new KeyMultiply(engine))
                .put(Keys.DIVISION.getSymbol(), new KeyDivision(engine))
                .put(Keys.PERCENTAGE.getSymbol(), new KeyPercentage(engine))
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
