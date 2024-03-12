package laborator.task2;

class IntegerCalculatorResult extends CalculatorResult {
    public IntegerCalculatorResult(CalculatorRequest request) {
        super(request);
    }

    @Override
    public Object computeResult() {
        int left = (Integer) request.getLeftOperand();
        int right = (Integer) request.getRightOperand();
        switch (request.getOperation()) {
            case "+": return left + right;
            case "-": return left - right;
            case "*": return left * right;
            case "/": return left / right;
            default: return 0;
        }
    }
}