package calculator.simple;

public enum Keys {
    ZERO("0"),
    ONE("1"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    DOT("."),
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVISION("/"),
    PERCENTAGE("%"),
    EQUAL("="),
    AC("AC"),
    SIGNUM("+/-");
    
    private final String symbol;

    Keys(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
