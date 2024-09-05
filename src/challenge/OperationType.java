package challenge;

public enum OperationType {
    ADD("+"),
    SUB("-"),
    MUL("*"),
    DIV("/");

    private final String type;

    OperationType(String type) {
        this.type = type;
    }

    public static OperationType from(String operator) {
        for(OperationType op : OperationType.values()) {
            if(op.type.equals(operator)) return op;
        }

        throw new IllegalArgumentException("제공하지 않는 연산입니다.");
    }
}
