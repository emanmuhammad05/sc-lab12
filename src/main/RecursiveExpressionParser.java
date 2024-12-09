public class RecursiveExpressionParser {
    
    // Evaluate Expression
    public static double evaluateExpression(String expression) {
        if (expression == null || expression.isEmpty()) {
            throw new IllegalArgumentException("Invalid expression");
        }
        return parseAddSubtract(expression);
    }
    
    // Parse Addition/Subtraction
    private static double parseAddSubtract(String expression) {
        int operatorIndex = findOperatorOutsideParentheses(expression, '+', '-');
        if (operatorIndex != -1) {
            char operator = expression.charAt(operatorIndex);
            double left = parseAddSubtract(expression.substring(0, operatorIndex));
            double right = parseMultiplyDivide(expression.substring(operatorIndex + 1));
            return operator == '+' ? left + right : left - right;
        }
        return parseMultiplyDivide(expression);
    }
    
    // Parse Multiplication/Division
    private static double parseMultiplyDivide(String expression) {
        int operatorIndex = findOperatorOutsideParentheses(expression, '*', '/');
        if (operatorIndex != -1) {
            char operator = expression.charAt(operatorIndex);
            double left = parseMultiplyDivide(expression.substring(0, operatorIndex));
            double right = parseTerm(expression.substring(operatorIndex + 1));
            if (operator == '/' && right == 0) {
                throw new ArithmeticException("Division by zero");
            }
            return operator == '*' ? left * right : left / right;
        }
        return parseTerm(expression);
    }
    
    // Parse Term (Number or Parenthesized Expression)
    private static double parseTerm(String expression) {
        expression = expression.trim();
        if (expression.startsWith("(") && expression.endsWith(")")) {
            return parseAddSubtract(expression.substring(1, expression.length() - 1));
        }
        return Double.parseDouble(expression);
    }
    
    // Find operator index outside parentheses
    private static int findOperatorOutsideParentheses(String expression, char op1, char op2) {
        int parentheses = 0;
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '(') parentheses++;
            else if (c == ')') parentheses--;
            else if ((c == op1 || c == op2) && parentheses == 0) {
                return i;
            }
        }
        return -1;
    }
    
    // Main method for testing
    public static void main(String[] args) {
        String expression = "(3 + 5) * 2 - 10 / 2";
        System.out.println("Result: " + evaluateExpression(expression)); // Output: 12.0
    }
}
