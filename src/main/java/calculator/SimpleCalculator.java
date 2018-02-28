package calculator;

public class SimpleCalculator implements Calculator {
    
    private String display;

    public SimpleCalculator() {
        display = "0";
    }

    public String press(Key key) {
        return display;
    }

    public String getDisplay() {
        return display;
    }
}
