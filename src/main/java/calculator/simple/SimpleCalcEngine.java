package calculator.simple;

import calculator.CalcEngine;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Stack;
import java.util.function.BiFunction;

public class SimpleCalcEngine implements CalcEngine{
    private boolean isAppending = true;
    private String display = Keys.ZERO.getSymbol();
    private Stack<BigDecimal> numberStack = new Stack<>();
    private Stack<BiFunction<BigDecimal, BigDecimal, BigDecimal>> biOperationStack = new Stack<>();

    public boolean isAppending() {
        return isAppending;
    }

    public void setAppending(boolean appending) {
        isAppending = appending;
    }

    @Override
    public String getDisplay() {
        return display;
    }
    
    public BigDecimal getCurrentNumber() {
        DecimalFormat format = new DecimalFormat();
        format.setParseBigDecimal(true);
        BigDecimal current = null;
        try {
            current = (BigDecimal) format.parse(getDisplay());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return current;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public Stack<BigDecimal> getNumberStack() {
        return numberStack;
    }

    public Stack<BiFunction<BigDecimal, BigDecimal, BigDecimal>> getBiOperationStack() {
        return biOperationStack;
    }

    @Override
    public void reset() {
        isAppending = false;
        display = Keys.ZERO.getSymbol();
        numberStack.clear();
        biOperationStack.clear();
    }

    public void computePreviousBiOperation() {
        if (getBiOperationStack().isEmpty()) {
            return;
        }

        BiFunction<BigDecimal, BigDecimal, BigDecimal> previousOperation =
                getBiOperationStack().pop();
        BigDecimal current = getCurrentNumber();
        BigDecimal previous = getNumberStack().pop();
        BigDecimal result = previousOperation.apply(previous, current);
        setDisplay(result.toString());
    }
}
