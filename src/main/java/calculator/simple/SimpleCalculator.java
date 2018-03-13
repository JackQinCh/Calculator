package calculator.simple;

import calculator.Calculator;
import calculator.Key;
import calculator.KeyText;
import com.sun.istack.internal.NotNull;

import java.util.Objects;

public class SimpleCalculator implements Calculator {

    final State IDLE_STATE;
    final State APPEND_STATE;

    private String display = KeyText.ZERO;
    private State state;

    public SimpleCalculator() {
        IDLE_STATE = new IdleState(this);
        APPEND_STATE = new AppendState(this);
        reset();
    }

    @NotNull
    @Override
    public String press(@NotNull final Key key) {
        Objects.requireNonNull(state);
        state.press(key);

        return getDisplay();
    }

    @NotNull
    @Override
    public String getDisplay() {
        return display;
    }

    @Override
    public void reset() {
        display = KeyText.ZERO;
        state = IDLE_STATE;
    }

    void setState(State state) {
        this.state = state;
    }

    void setDisplay(String display) {
        this.display = display;

    }

}
