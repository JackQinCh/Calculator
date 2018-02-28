package calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleCalculatorTest {
    
    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new SimpleCalculator();
    }

    @Test
    public void press_number_key() {
        String result = calculator.press(Key.ZERO);
        assertEquals("0", result);

        calculator.press(Key.AC);
        result = calculator.press(Key.ONE);
        assertEquals("1", result);
    }

    @Test
    public void getDisplay_withoutAnyKeys() {
        assertEquals("0", calculator.getDisplay());
    }
}