package laborator.task2;

import java.util.ArrayList;
import java.util.List;

class SmarterCalculator {
    public static List<CalculatorResult> calculate(String[] args) {
        List<CalculatorRequest> requests = InputConverter.mapRequests(args);
        List<CalculatorResult> results = new ArrayList<>();
        for (CalculatorRequest request : requests) {
            CalculatorResult result = null;
            switch (request.getRequestType()) {
                case "Integer":
                    result = new IntegerCalculatorResult(request);
                    break;
                case "Double":
                    result = new DoubleCalculatorResult(request);
                    break;
                case "Boolean":
                    result = new BooleanCalculatorResult(request);
                    break;
            }
            if (result != null) {
                results.add(result);
            }
        }
        return results;
    }
}