package calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleCalculatorTest {
    
    private Calculator calculator;

    private final static Key[] numberKeys = {Key.ZERO, Key.ONE, Key.TWO, Key.THREE, 
            Key.FOUR, Key.FIVE, Key.SIX, Key.SEVEN, Key.EIGHT, Key.NINE};

    @Before
    public void setUp() throws Exception {
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
        
    }

    @Test
    public void press_combNumberKeys_withZero() {

    }

    @Test
    public void getDisplay_withoutAnyKeys() {
        assertEquals("0", calculator.getDisplay());
    }
}