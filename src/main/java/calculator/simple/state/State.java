package calculator.simple.state;

import calculator.Key;

public interface State {
    void press(Key key);
}
