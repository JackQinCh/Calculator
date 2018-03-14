package calculator.memorable;

import calculator.simple.SimpleCalcEngine;

import java.math.BigDecimal;

public class MemorableCalcEngine extends SimpleCalcEngine implements Memorable{
    private BigDecimal memory = BigDecimal.ZERO;
    
    @Override
    public BigDecimal getMemory() {
        return memory;
    }

    @Override
    public void setMemory(BigDecimal memory) {
        this.memory = memory;
    }
}
