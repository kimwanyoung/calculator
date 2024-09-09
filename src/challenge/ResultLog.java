package challenge;

public class ResultLog {
    private Operand first;
    private Operand second;
    private double result;
    private String operationType;

    public ResultLog(Operand first, Operand second, double result, String operationType) {
        this.first = first;
        this.second = second;
        this.result = result;
        this.operationType = operationType;
    }

    public boolean moreThan(double number) {
        return this.result > number;
    }

    @Override
    public String toString() {
        return first.getValue() + " " + operationType + " " + second.getValue() + " = " + result;
    }
}
