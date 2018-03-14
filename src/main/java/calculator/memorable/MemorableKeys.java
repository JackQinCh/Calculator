package calculator.memorable;

public enum MemorableKeys {
    MEMORY_READ("MR"),
    MEMORY_PLUS("M+"),
    MEMORY_MINUS("M-"),
    MEMORY_CLEAR("MC");

    private final String symbol;

    MemorableKeys(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
