package calculator;

import calculator.basic.Keys;
import calculator.basic.BasicCalculator;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class BasicCalculatorTest {
    
    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new BasicCalculator();
    }

    @Test
    public void testGetAllKeys() throws Exception {
        Set<String> expectedKeys =
                Arrays.stream(Keys.values())
                        .map(Keys::getSymbol)
                        .collect(Collectors.toSet());

        assertEquals(expectedKeys, calculator.getAllKeys().collect(Collectors.toSet()));
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
    public void testPressKey_add() throws Exception {
        calculator.reset()
                .pressKey(Keys.ONE.getSymbol())
                .pressKey(Keys.ADD.getSymbol())
                .pressKey(Keys.ONE.getSymbol())
                .pressKey(Keys.ADD.getSymbol());
        
        assertEquals("2", calculator.getDisplay());
    }

    @Test
    public void testPressKey_addWithZero() throws Exception {
        calculator.reset()
                .pressKey(Keys.ONE.getSymbol())
                .pressKey(Keys.ADD.getSymbol())
                .pressKey(Keys.ZERO.getSymbol())
                .pressKey(Keys.ADD.getSymbol())
                .pressKey(Keys.ONE.getSymbol())
                .pressKey(Keys.ADD.getSymbol());

        assertEquals("2", calculator.getDisplay());
    }

    @Test
    public void testPressKey_subtract() throws Exception {
        calculator.reset()
                .pressKey(Keys.TWO.getSymbol())
                .pressKey(Keys.SUBTRACT.getSymbol())
                .pressKey(Keys.ONE.getSymbol())
                .pressKey(Keys.SUBTRACT.getSymbol());

        assertEquals("1", calculator.getDisplay());
    }

    @Test
    public void testPressKey_subtractNegative() throws Exception {
        calculator.reset()
                .pressKey(Keys.ONE.getSymbol())
                .pressKey(Keys.SUBTRACT.getSymbol())
                .pressKey(Keys.TWO.getSymbol())
                .pressKey(Keys.SUBTRACT.getSymbol());

        assertEquals("-1", calculator.getDisplay());
    }

    @Test
    public void testPressKey_multiply() throws Exception {
        calculator.reset()
                .pressKey(Keys.TWO.getSymbol())
                .pressKey(Keys.MULTIPLY.getSymbol())
                .pressKey(Keys.TWO.getSymbol())
                .pressKey(Keys.MULTIPLY.getSymbol());

        assertEquals("4", calculator.getDisplay());
    }

    @Test
    public void testPressKey_multiplyZero() throws Exception {
        calculator.reset()
                .pressKey(Keys.TWO.getSymbol())
                .pressKey(Keys.MULTIPLY.getSymbol())
                .pressKey(Keys.ZERO.getSymbol())
                .pressKey(Keys.MULTIPLY.getSymbol());

        assertEquals("0", calculator.getDisplay());
    }

    @Test
    public void testPressKey_multiplyNegative() throws Exception {
        calculator.reset()
                .pressKey(Keys.ONE.getSymbol())
                .pressKey(Keys.SUBTRACT.getSymbol())
                .pressKey(Keys.TWO.getSymbol())
                .pressKey(Keys.MULTIPLY.getSymbol())
                .pressKey(Keys.TWO.getSymbol())
                .pressKey(Keys.MULTIPLY.getSymbol());

        assertEquals("-2", calculator.getDisplay());
    }

    @Test
    public void testPressKey_division() throws Exception {
        calculator.reset()
                .pressKey(Keys.TWO.getSymbol())
                .pressKey(Keys.DIVISION.getSymbol())
                .pressKey(Keys.TWO.getSymbol())
                .pressKey(Keys.DIVISION.getSymbol());

        assertEquals("1", calculator.getDisplay());
    }

    @Test
    public void testPressKey_divisionInfinite() throws Exception {
        calculator.reset()
                .pressKey(Keys.ONE.getSymbol())
                .pressKey(Keys.DIVISION.getSymbol())
                .pressKey(Keys.THREE.getSymbol())
                .pressKey(Keys.EQUAL.getSymbol());

        assertEquals("0.33333333", calculator.getDisplay());
    }

    @Test(expected = ArithmeticException.class)
    public void testPressKey_divideZero() throws Exception {
        calculator.reset()
                .pressKey(Keys.TWO.getSymbol())
                .pressKey(Keys.DIVISION.getSymbol())
                .pressKey(Keys.ZERO.getSymbol())
                .pressKey(Keys.DIVISION.getSymbol());
    }

    @Test
    public void testPressKey_percentage() throws Exception {
        calculator.reset()
                .pressKey(Keys.TWO.getSymbol())
                .pressKey(Keys.PERCENTAGE.getSymbol());

        assertEquals("0.02", calculator.getDisplay());
    }

    @Test
    public void testPressKey_doublePercentage() throws Exception {
        calculator.reset()
                .pressKey(Keys.TWO.getSymbol())
                .pressKey(Keys.PERCENTAGE.getSymbol())
                .pressKey(Keys.PERCENTAGE.getSymbol());

        assertEquals("0.0002", calculator.getDisplay());
    }

    @Test
    public void testPressKey_percentageWithBiOperation() throws Exception {
        calculator.reset()
                .pressKey(Keys.TWO.getSymbol())
                .pressKey(Keys.PERCENTAGE.getSymbol())
                .pressKey(Keys.ADD.getSymbol())
                .pressKey(Keys.TWO.getSymbol())
                .pressKey(Keys.ADD.getSymbol());

        assertEquals("2.02", calculator.getDisplay());
    }

    @Test
    public void testPressKey_percentageWithChangeBiOperation() throws Exception {
        calculator.reset()
                .pressKey(Keys.TWO.getSymbol())
                .pressKey(Keys.ADD.getSymbol())
                .pressKey(Keys.SUBTRACT.getSymbol())
                .pressKey(Keys.PERCENTAGE.getSymbol())
                .pressKey(Keys.ADD.getSymbol());

        assertEquals("1.98", calculator.getDisplay());
    }

    @Test
    public void testPressKey_equal() throws Exception {
        calculator.reset()
                .pressKey(Keys.TWO.getSymbol())
                .pressKey(Keys.ADD.getSymbol())
                .pressKey(Keys.THREE.getSymbol())
                .pressKey(Keys.ONE.getSymbol())
                .pressKey(Keys.EQUAL.getSymbol());

        assertEquals("33", calculator.getDisplay());
    }

    @Test
    public void testPressKey_equalWithUnOperation() throws Exception {
        calculator.reset()
                .pressKey(Keys.TWO.getSymbol())
                .pressKey(Keys.ADD.getSymbol())
                .pressKey(Keys.THREE.getSymbol())
                .pressKey(Keys.ONE.getSymbol())
                .pressKey(Keys.EQUAL.getSymbol())
                .pressKey(Keys.PERCENTAGE.getSymbol());

        assertEquals("0.33", calculator.getDisplay());
    }

    @Test
    public void testPressKey_equalWithBiOperation() throws Exception {
        calculator.reset()
                .pressKey(Keys.TWO.getSymbol())
                .pressKey(Keys.ADD.getSymbol())
                .pressKey(Keys.THREE.getSymbol())
                .pressKey(Keys.ONE.getSymbol())
                .pressKey(Keys.EQUAL.getSymbol())
                .pressKey(Keys.MULTIPLY.getSymbol())
                .pressKey(Keys.TWO.getSymbol())
                .pressKey(Keys.EQUAL.getSymbol());

        assertEquals("66", calculator.getDisplay());
    }

    @Test
    public void testPressKey_equalWithNumber() throws Exception {
        calculator.reset()
                .pressKey(Keys.TWO.getSymbol())
                .pressKey(Keys.EQUAL.getSymbol())
                .pressKey(Keys.ADD.getSymbol())
                .pressKey(Keys.ONE.getSymbol())
                .pressKey(Keys.EQUAL.getSymbol());

        assertEquals("3", calculator.getDisplay());
    }
    
    @Test
    public void testAllCleanKey() {
        calculator.reset()
                .pressKey(Keys.TWO.getSymbol())
                .pressKey(Keys.EQUAL.getSymbol())
                .pressKey(Keys.ADD.getSymbol())
                .pressKey(Keys.ONE.getSymbol())
                .pressKey(Keys.EQUAL.getSymbol())
                .pressKey(Keys.AC.getSymbol());

        assertEquals("0", calculator.getDisplay());
    }

    @Test
    public void testSignumKey() {
        calculator.reset()
                .pressKey(Keys.TWO.getSymbol())
                .pressKey(Keys.SIGNUM.getSymbol());

        assertEquals("-2", calculator.getDisplay());
    }

    @Test
    public void testSignumKey_double() {
        calculator.reset()
                .pressKey(Keys.TWO.getSymbol())
                .pressKey(Keys.SIGNUM.getSymbol())
                .pressKey(Keys.SIGNUM.getSymbol());

        assertEquals("2", calculator.getDisplay());
    }

    @Test
    public void testSignumKey_withBiOperation() {
        calculator.reset()
                .pressKey(Keys.TWO.getSymbol())
                .pressKey(Keys.SIGNUM.getSymbol())
                .pressKey(Keys.ADD.getSymbol())
                .pressKey(Keys.FIVE.getSymbol())
                .pressKey(Keys.EQUAL.getSymbol());

        assertEquals("3", calculator.getDisplay());
    }

    @Test
    public void testSignumKey_withNewNumber() {
        calculator.reset()
                .pressKey(Keys.TWO.getSymbol())
                .pressKey(Keys.SIGNUM.getSymbol())
                .pressKey(Keys.FIVE.getSymbol())
                .pressKey(Keys.EQUAL.getSymbol());

        assertEquals("5", calculator.getDisplay());
    }
}