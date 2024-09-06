package challenge;

public class ResultLog {
    private Number first;
    private Number second;
    private Number result;
    private String operationType;

    public ResultLog(Number first, Number second, Number result, String operationType) {
        this.first = first;
        this.second = second;
        this.result = result;
        this.operationType = operationType;
    }

    public boolean moreThan(Number number) {
        return this.result.doubleValue() > number.doubleValue();
    }

    @Override
    public String toString() {
        return "ResultLog{" +
                "first=" + first +
                ", second=" + second +
                ", result=" + result +
                ", operationType='" + operationType + '\'' +
                '}';
    }
}
