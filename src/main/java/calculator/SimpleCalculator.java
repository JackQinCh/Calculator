package calculator;

import com.google.common.collect.ImmutableMap;
import com.sun.istack.internal.NotNull;

import java.util.Map;

public class SimpleCalculator implements Calculator {
    private static final String ZERO = "0";

    private String display = ZERO;

    private final static Map<Key, String> NUMBER_KEY_DISPLAY =
            ImmutableMap.<Key, String>builder()
                    .put(Key.ZERO, "0")
                    .put(Key.ONE, "1")
                    .put(Key.TWO, "2")
                    .put(Key.THREE, "3")
                    .put(Key.FOUR, "4")
                    .put(Key.FIVE, "5")
                    .put(Key.SIX, "6")
                    .put(Key.SEVEN, "7")
                    .put(Key.EIGHT, "8")
                    .put(Key.NINE, "9")
                    .build();

    public SimpleCalculator() {
        reset();
    }

    @NotNull
    @Override
    public String press(@NotNull final Key key) {
        if (NUMBER_KEY_DISPLAY.containsKey(key)) {
            appendNumberToDisplay(NUMBER_KEY_DISPLAY.get(key));
        } else {
            throw new IllegalArgumentException("Unsupported key");
        }
        return getDisplay();
    }

    protected void setDisplay(String display) {
        this.display = display;
    }

    @NotNull
    @Override
    public String getDisplay() {
        return display;
    }

    @Override
    public void reset() {
        setDisplay(ZERO);
    }

    private void appendNumberToDisplay(String number) {
        if (getDisplay().equals(ZERO)) {
            setDisplay(number);
        } else {
            setDisplay(getDisplay() + number);
        }
    }
}
