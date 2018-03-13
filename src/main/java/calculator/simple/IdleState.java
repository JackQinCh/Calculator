package calculator.simple;

import calculator.Key;
import calculator.KeyText;
import calculator.KeyType;
import org.apache.commons.lang3.StringUtils;

public class IdleState implements State{

    private final SimpleCalculator calculator;

    IdleState(SimpleCalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void press(Key key) {
        if (key.getKeyType() == KeyType.Number && !StringUtils.equals(key.getKeyText(), KeyText.ZERO)) {
            if (StringUtils.equals(key.getKeyText(), KeyText.DOT)) {
                calculator.setDisplay(calculator.getDisplay() + key.getKeyText());
            } else {
                calculator.setDisplay(key.getKeyText());
            }
            calculator.setState(calculator.APPEND_STATE);
        }
    }
}
