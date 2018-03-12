package calculator;

public enum KeyType {
    /* Stop input appending. Like +, -, *, /, =... */
    Operation,

    /* Keep appending input. Like numbers, dot... */
    Number,

    /* No change for appending input state. Like '+/-'. */
    Assistant
}
