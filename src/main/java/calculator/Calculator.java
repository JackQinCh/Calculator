package calculator;

import java.util.stream.Stream;

public interface Calculator {
    Calculator press(String key);
    Calculator reset();
    Stream<String> getAllKeys();
    String getDisplay();
}
