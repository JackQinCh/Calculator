package calculator.basic;

import calculator.CalcEngine;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Stack;
import java.util.function.BiFunction;

public class BasicCalcEngine implements CalcEngine{
    private EngineStatus status = EngineStatus.Appending;
    private String display = Keys.ZERO.getSymbol();
    private Stack<BigDecimal> numberStack = new Stack<>();
    private Stack<BiFunction<BigDecimal, BigDecimal, BigDecimal>> biOperationStack = new Stack<>();

    public EngineStatus getStatus() {
        return status;
    }

    public void setStatus(EngineStatus status) {
        this.status = status;
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
        status = EngineStatus.Appending;
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
        setDisplay(result.stripTrailingZeros().toPlainString());
    }

    @Override
    public String toString() {
        return new ReflectionToStringBuilder(this).toString();
    }
}
