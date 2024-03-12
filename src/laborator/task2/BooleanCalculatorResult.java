package laborator.task2;

class BooleanCalculatorResult extends CalculatorResult {
    public BooleanCalculatorResult(CalculatorRequest request) {
        super(request);
    }

    @Override
    public Object computeResult() {
        boolean left = (Boolean) request.getLeftOperand();
        boolean right = (Boolean) request.getRightOperand();
        return left && right;
    }
}