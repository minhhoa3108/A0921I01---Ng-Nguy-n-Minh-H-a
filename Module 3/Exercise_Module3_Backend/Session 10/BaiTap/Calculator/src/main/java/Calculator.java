public class Calculator {
    public static float calculate(float firstOperator, float secondOperator, char operator){
        switch (operator){
            case '+':
                return firstOperator + secondOperator;
            case '-':
                return firstOperator - secondOperator;
            case '*':
                return firstOperator * secondOperator;
            case '/':
                if(secondOperator != 0){
                    return firstOperator / secondOperator;
                }else
                    throw new RuntimeException("Không thể chia cho 0");
            default:
                throw new RuntimeException("invald operator");
        }
    }
}
