package calculator.simple.keys;

import calculator.Key;
import calculator.simple.EngineStatus;
import calculator.simple.SimpleCalcEngine;

import java.math.BigDecimal;

public class KeySignum implements Key{
    protected SimpleCalcEngine engine;
    
    public KeySignum(SimpleCalcEngine engine) {
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
