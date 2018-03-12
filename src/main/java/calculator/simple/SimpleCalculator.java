package calculator.simple;

import calculator.Calculator;
import calculator.Key;
import com.sun.istack.internal.NotNull;

public class SimpleCalculator implements Calculator {
    private static final String ZERO = "0";

    private String display = ZERO;

    public SimpleCalculator() {
        reset();
    }

    @NotNull
    @Override
    public String press(@NotNull final Key key) {
        return getDisplay();
    }

    @NotNull
    @Override
    public String getDisplay() {
        return display;
    }

    @Override
    public void reset() {
        display = ZERO;
    }

}
