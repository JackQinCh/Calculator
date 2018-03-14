package calculator;

import java.util.stream.Stream;

public interface Calculator {
    String press(String key);
    Stream<String> getAllKeys();
    String getDisplay();
    void reset();
}
