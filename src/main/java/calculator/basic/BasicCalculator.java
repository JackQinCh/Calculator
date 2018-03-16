package calculator.basic;

import calculator.CalcEngine;
import calculator.Calculator;
import calculator.Key;
import calculator.basic.keys.*;
import com.google.common.collect.ImmutableMap;
import com.sun.istack.internal.NotNull;

import java.util.Map;
import java.util.stream.Stream;

public class BasicCalculator implements Calculator {
    
    private final BasicCalcEngine engine;
    private final Map<String, Key> keyMap;

    public BasicCalculator() {
        this.engine = new BasicCalcEngine();
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
                .put(Keys.EQUAL.getSymbol(), new KeyEqual(engine))
                .put(Keys.AC.getSymbol(), new KeyAllClean(engine))
                .put(Keys.SIGNUM.getSymbol(), new KeySignum(engine))
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

}
