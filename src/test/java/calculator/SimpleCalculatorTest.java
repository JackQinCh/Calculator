package calculator;

import calculator.simple.Keys;
import calculator.simple.SimpleCalculator;
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
    public void testPressKey_startWithZero() throws Exception{
        calculator.reset()
                .pressKey(Keys.ZERO.getSymbol())
                .pressKey(Keys.ZERO.getSymbol())
                .pressKey(Keys.ZERO.getSymbol());

        assertEquals("0", calculator.getDisplay());
    }

    @Test
    public void testPressKey_numbers() throws Exception{
        calculator.reset()
                .pressKey(Keys.ONE.getSymbol())
                .pressKey(Keys.TWO.getSymbol())
                .pressKey(Keys.ZERO.getSymbol());

        assertEquals("120", calculator.getDisplay());
    }

    @Test
    public void testPressKey_dot() throws Exception{
        calculator.reset()
                .pressKey(Keys.DOT.getSymbol())
                .pressKey(Keys.TWO.getSymbol());

        assertEquals("0.2", calculator.getDisplay());
    }

    @Test
    public void testPressKey_onlyDot() throws Exception{
        calculator.reset()
                .pressKey(Keys.DOT.getSymbol());

        assertEquals("0.", calculator.getDisplay());
    }

    @Test
    public void testPressKey_multipleDot() throws Exception{
        calculator.reset()
                .pressKey(Keys.DOT.getSymbol())
                .pressKey(Keys.TWO.getSymbol())
                .pressKey(Keys.DOT.getSymbol())
                .pressKey(Keys.DOT.getSymbol());


        assertEquals("0.2", calculator.getDisplay());
    }
    
    @Test
    public void testPressKey_plus() throws Exception {
        calculator.reset()
                .pressKey(Keys.ONE.getSymbol())
                .pressKey(Keys.PLUS.getSymbol())
                .pressKey(Keys.ONE.getSymbol())
                .pressKey(Keys.PLUS.getSymbol());
        
        assertEquals("2", calculator.getDisplay());
    }

    @Test
    public void testPressKey_plusWithZero() throws Exception {
        calculator.reset()
                .pressKey(Keys.ONE.getSymbol())
                .pressKey(Keys.PLUS.getSymbol())
                .pressKey(Keys.ZERO.getSymbol())
                .pressKey(Keys.PLUS.getSymbol())
                .pressKey(Keys.ONE.getSymbol())
                .pressKey(Keys.PLUS.getSymbol());

        assertEquals("2", calculator.getDisplay());
    }
}