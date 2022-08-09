import java.util.Scanner;

class Calculator {

    static  double addition(double operand1, double operand2){
        return  operand1 + operand2;
    }

    static  double subtraction(double operand1, double operand2){
        return operand1 - operand2;
    }

    static  double multiplication(double operand1, double operand2){
        return operand1 * operand2;
    }

    static  double division(double operand1, double operand2){
        return operand1 / operand2;
    }

public static double calculator(double operand1,double operand2, char operator){
           double result = 0;
            switch (operator) {
                case '+':
                    result = addition(operand1, operand2);
                    break;
                case '-':
                    result = subtraction(operand1, operand2);
                    break;
                case '*':
                    result = multiplication(operand1, operand2);
                    break;
                case '/':
                    result = division(operand1, operand2);
                    break;
                default:
                    System.out.println("Введено не корректне значення");
                    break;
            }
            return  result;
        }

    public static void main(String[] args){
        char operator;
        Double operand1, operand2;
        Scanner input = new Scanner(System.in);

        System.out.println("Введіть перше число");
        operand1 = input.nextDouble();

        System.out.println("Вкажіть дію яку я маю зробити з цим числом: + (додати), - (відняти), * (помножити), / (поділити)");
        operator = input.next().charAt(0);

        System.out.println("Введіть друге число");
        operand2 = input.nextDouble();

        System.out.println(operand1 + " " + operator + " " + operand2 + " = " + calculator(operand1, operand2, operator));
    }
}
