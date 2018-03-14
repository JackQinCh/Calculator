package calculator;

import java.util.stream.Stream;

public interface Calculator {
    Calculator pressKey(String key);
    Calculator reset();
    Stream<String> getAllKeys();
    String getDisplay();
}
