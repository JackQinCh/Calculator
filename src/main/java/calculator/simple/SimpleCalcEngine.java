package calculator.simple;

import calculator.CalcEngine;

import java.math.BigDecimal;
import java.util.Stack;
import java.util.function.BiFunction;

public class SimpleCalcEngine implements CalcEngine{
    private boolean isAppending = false;
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
}
