package calculator.simple;

import calculator.Key;

public interface State {
    void press(Key key);
}
