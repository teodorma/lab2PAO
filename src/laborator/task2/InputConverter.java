package laborator.task2;

import java.util.ArrayList;
import java.util.List;

class InputConverter {
    public static List<CalculatorRequest> mapRequests(String[] args) {
        List<CalculatorRequest> requests = new ArrayList<>();
        for (int i = 0; i < args.length; i += 3) {
            Object leftOperand = parseOperand(args[i]);
            Object rightOperand = parseOperand(args[i + 2]);
            String operation = args[i + 1];
            requests.add(new CalculatorRequest(leftOperand, rightOperand, operation));
        }
        return requests;
    }

    private static Object parseOperand(String operand) {
        try {
            return Integer.parseInt(operand);
        } catch (NumberFormatException e) {
            try {
                return Double.parseDouble(operand);
            } catch (NumberFormatException ex) {
                if ("true".equals(operand.toLowerCase()) || "false".equals(operand.toLowerCase())) {
                    return Boolean.parseBoolean(operand);
                }
            }
        }
        return 0;
    }
}
