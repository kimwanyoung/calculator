package challenge;

public class ResultLog {
    private Number first;
    private Number second;
    private String operationType;

    public ResultLog(Number first, Number second, String operationType) {
        this.first = first;
        this.second = second;
        this.operationType = operationType;
    }

    @Override
    public String toString() {
        return "ResultLog{" +
                "first=" + first +
                ", second=" + second +
                ", operationType='" + operationType + '\'' +
                '}';
    }
}
