package laborator.task2;


class CalculatorRequest {
    private Object leftOperand;
    private Object rightOperand;
    private String operation;

    public CalculatorRequest(Object leftOperand, Object rightOperand, String operation) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operation = operation;
    }

    public String getRequestType() {
        if (leftOperand instanceof Integer && rightOperand instanceof Integer) {
            return "Integer";
        } else if (leftOperand instanceof Double || rightOperand instanceof Double) {
            return "Double";
        } else if (leftOperand instanceof Boolean && rightOperand instanceof Boolean) {
            return "Boolean";
        }
        return "Unknown";
    }

    public String toString() {
        return leftOperand + " " + operation + " " + rightOperand;
    }

    public Object getLeftOperand() {
        return leftOperand;
    }

    public Object getRightOperand() {
        return rightOperand;
    }

    public String getOperation() {
        return operation;
    }
}
