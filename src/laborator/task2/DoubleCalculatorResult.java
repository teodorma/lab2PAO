package laborator.task2;

class DoubleCalculatorResult extends CalculatorResult {
    public DoubleCalculatorResult(CalculatorRequest request) {
        super(request);
    }

    @Override
    public Object computeResult() {
        double left = toDouble(request.getLeftOperand());
        double right = toDouble(request.getRightOperand());
        switch (request.getOperation()) {
            case "+": return left + right;
            case "-": return left - right;
            case "*": return left * right;
            case "/": return left / right;
            default: return 0.0;
        }
    }

    private double toDouble(Object operand) {
        if (operand instanceof Double) {
            return (Double) operand;
        } else if (operand instanceof Integer) {
            return ((Integer) operand).doubleValue();
        }
        return 0.0; // Default case, ideally handle this better
    }
}