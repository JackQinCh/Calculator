package calculator.memorable;

import calculator.basic.BasicCalcEngine;

import java.math.BigDecimal;

public class MemorableCalcEngine extends BasicCalcEngine implements Memorable{
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
