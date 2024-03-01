import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Task1 {
    public int evaluateExpression(String expression) {
        if (expression == null || expression.isEmpty()) {
            return 0;
        }

        Map<Character, Integer> operands = new HashMap<>();
        Stack<Character> operators = new Stack<>();

        int value = 0;

        for (char c : expression.toCharArray()) {
            if (Character.isDigit(c)) {
                value = value * 10 + (c - '0');
            }

            if (c == '+' || c == '-' || c == '*' || c == '/') {
                operands.put(c, value);
                value = 0;
            }

            if (c == '(') {
                operators.push(c);
            }

            if (c == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    char operator = operators.pop();
                    int right = operands.get(c);
                    int left = operands.get(operators.pop());
                    switch (operator) {
                        case '+':
                            operands.put(c, left + right);
                            break;
                        case '-':
                            operands.put(c, left - right);
                            break;
                        case '*':
                            operands.put(c, left * right);
                            break;
                        case '/':
                            operands.put(c, left / right);
                            break;
                    }
                }
                operators.pop();
            }

            if (!operators.isEmpty() && (c == '+' || c == '-') && (operators.peek() == '*' || operators.peek() == '/')) {
                char operator = operators.pop();
                int right = operands.get(c);
                int left = operands.get(operators.pop());
                switch (operator) {
                    case '+':
                        operands.put(c, left + right);
                        break;
                    case '-':
                        operands.put(c, left - right);
                        break;
                }
                operators.push(c);
            } else {
                operators.push(c);
            }
        }

        return operands.get(operators.peek());
    }



}
