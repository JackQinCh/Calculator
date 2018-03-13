package calculator.key;

import calculator.Key;
import calculator.KeyType;

public abstract class NumberKey implements Key {
    @Override
    public KeyType getKeyType() {
        return KeyType.Number;
    }

    @Override
    public abstract String getKeyText();
}
