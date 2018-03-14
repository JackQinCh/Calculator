package calculator.simple;

import calculator.CalcEngine;

import java.math.BigDecimal;
import java.util.Stack;
import java.util.function.BiFunction;

public class SimpleCalcEngine implements CalcEngine{
    private boolean isAppending = false;
    private String display = KeySet.ZERO;
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

    public void setNumberStack(Stack<BigDecimal> numberStack) {
        this.numberStack = numberStack;
    }

    public Stack<BiFunction<BigDecimal, BigDecimal, BigDecimal>> getBiOperationStack() {
        return biOperationStack;
    }

    public void setBiOperationStack(Stack<BiFunction<BigDecimal, BigDecimal, BigDecimal>> biOperationStack) {
        this.biOperationStack = biOperationStack;
    }
    
    @Override
    public void reset() {
        isAppending = false;
        display = KeySet.ZERO;
        numberStack.clear();
        biOperationStack.clear();
    }
}
