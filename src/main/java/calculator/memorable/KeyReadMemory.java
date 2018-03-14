package calculator.memorable;

import calculator.Key;

public class KeyReadMemory implements Key {
    private MemorableCalcEngine engine;

    public KeyReadMemory(MemorableCalcEngine engine) {
        this.engine = engine;
    }

    @Override
    public void press() {
        engine.setDisplay(engine.getMemory().toString());
    }
}
