package calculator.basic.keys;

import calculator.basic.EngineStatus;
import calculator.basic.KeyNumber;
import calculator.basic.Keys;
import calculator.basic.BasicCalcEngine;

public class KeyDot extends KeyNumber {
    public KeyDot(BasicCalcEngine engine) {
        super(engine);
    }

    @Override
    public void press() {
        if (engine.getStatus() == EngineStatus.Appending) {
            if (!engine.getDisplay().contains(getSymbol())) {
                engine.setDisplay(engine.getDisplay() + getSymbol());
            }
        } else {
            engine.setDisplay(Keys.ZERO.getSymbol() + getSymbol());
            engine.setStatus(EngineStatus.Appending);
        }
    }

    @Override
    protected String getSymbol() {
        return Keys.DOT.getSymbol();
    }
}
