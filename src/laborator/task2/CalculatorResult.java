package laborator.task2;

abstract class CalculatorResult {
    protected CalculatorRequest request;

    protected CalculatorResult(CalculatorRequest request) {
        this.request = request;
    }

    public abstract Object computeResult();

    public CalculatorRequest getRequest() {
        return request;
    }
}
