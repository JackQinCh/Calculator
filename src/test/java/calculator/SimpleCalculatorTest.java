package calculator;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class SimpleCalculatorTest {
    
    private Calculator calculator;

    private final static Key[] numberKeys = {Key.ZERO, Key.ONE, Key.TWO, Key.THREE, 
            Key.FOUR, Key.FIVE, Key.SIX, Key.SEVEN, Key.EIGHT, Key.NINE};

    @Before
    public void setUp() {
        calculator = new SimpleCalculator();
    }

    @Test
    public void press_singleNumberKey() {
        for (int i = 0; i < numberKeys.length; i++) {
            assertEquals(String.valueOf(i), calculator.press(numberKeys[i]));
            calculator.reset();
        }
    }
    
    @Test
    public void press_combNumberKeys_withoutZero() {
        for (int i = 0; i < 20; i++) {
            int combCount = new Random().nextInt(10) + 2;
            StringBuilder display = new StringBuilder();
            for (int j = 0; j < combCount; j++) {
                int keyIndex = new Random().nextInt(8) + 1;
                calculator.press(numberKeys[keyIndex]);
                display.append(String.valueOf(keyIndex));
            }
            assertEquals(display.toString(), calculator.getDisplay());
            calculator.reset();
        }
    }

    @Test
    public void press_combNumberKeys_withZero() {
        calculator.press(Key.ZERO);
        calculator.press(Key.ZERO);
        calculator.press(Key.ONE);
        calculator.press(Key.ZERO);
        calculator.press(Key.ZERO);
        assertEquals("100", calculator.getDisplay());
    }

    @Test
    public void getDisplay_withoutAnyKeys() {
        assertEquals("0", calculator.getDisplay());
    }

    @Test
    public void reset() {
        calculator.press(Key.FIVE);
        calculator.reset();

        assertEquals("0", calculator.getDisplay());
    }
}