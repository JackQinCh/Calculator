package calculator.basic.keys;

import calculator.Key;
import calculator.basic.EngineStatus;
import calculator.basic.BasicCalcEngine;

public class KeyEqual implements Key {
    protected BasicCalcEngine engine;

    public KeyEqual(BasicCalcEngine engine) {
        this.engine = engine;
    }

    @Override
    public void press() {
        engine.setStatus(EngineStatus.NewNumber);
        engine.computePreviousBiOperation();
        
        //TODO: Implement continued equal key function
    }
}
