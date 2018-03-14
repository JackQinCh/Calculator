package calculator.simple;

import calculator.Key;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.function.Function;

/**
 * Unitary operation key
 */
public abstract class KeyUnOperation implements Key{
    protected SimpleCalcEngine engine;

    public KeyUnOperation(SimpleCalcEngine engine) {
        this.engine = engine;
    }

    @Override
    public void press() {
        engine.setAppending(false);
        computeOperation(engine);
    }

    protected abstract String getSymbol();

    protected abstract Function<BigDecimal, BigDecimal> getOperation();
    
    private void computeOperation(SimpleCalcEngine engine) {
        DecimalFormat format = new DecimalFormat();
        format.setParseBigDecimal(true);
        BigDecimal current = null;
        try {
            current = (BigDecimal) format.parse(engine.getDisplay());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        BigDecimal result = getOperation().apply(current);
        engine.setDisplay(result.toString());
    }
}
