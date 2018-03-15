package calculator.simple.keys;

import calculator.Key;
import calculator.simple.EngineStatus;
import calculator.simple.SimpleCalcEngine;

public class KeyEqual implements Key {
    protected SimpleCalcEngine engine;

    public KeyEqual(SimpleCalcEngine engine) {
        this.engine = engine;
    }

    @Override
    public void press() {
        engine.setStatus(EngineStatus.NewNumber);
        engine.computePreviousBiOperation();
        
        //TODO: Implement continued equal key function
    }
}
