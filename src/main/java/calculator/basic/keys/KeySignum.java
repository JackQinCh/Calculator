package calculator.basic.keys;

import calculator.Key;
import calculator.basic.EngineStatus;
import calculator.basic.BasicCalcEngine;

import java.math.BigDecimal;

public class KeySignum implements Key{
    protected BasicCalcEngine engine;
    
    public KeySignum(BasicCalcEngine engine) {
        this.engine = engine;
    }

    @Override
    public void press() {
        engine.setStatus(EngineStatus.NewNumber);
        BigDecimal newNumber = engine.getCurrentNumber().negate();
        engine.setDisplay(newNumber.toString());
    }
    
    private boolean isNegative(BigDecimal number) {
        return number.signum() == -1;
    }
}
