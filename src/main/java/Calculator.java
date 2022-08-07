import java.util.Scanner;

class Calculator {
    public static void main(String[] args){
        char operator;
        Double operand1, operand2, result;
        Scanner input = new Scanner(System.in);

        System.out.println("Введіть перше число");
        operand1 = input.nextDouble();

        System.out.println("Вкажіть дію яку я маю зробити з цим числом: + (додати), - (відняти), * (помножити), / (поділити)");
        operator = input.next().charAt(0);

        System.out.println("Введіть друге число");
        operand2 = input.nextDouble();

        switch (operator) {
            case '+':
                result = operand1 + operand2;
                System.out.println(operand1 + " + " + operand2 + " = " + result);
                break;
            case '-':
                result = operand1 - operand2;
                System.out.println(operand1 + " - " + operand2 + " = " + result);
                break;
            case '*':
                result = operand1 * operand2;
                System.out.println(operand1 + " * " + operand2 + " + " + result);
                break;
            case '/':
                result = operand1 / operand2;
                System.out.println(operand1 + " / " + operand2 + " = " + result);
                break;
            default:
                System.out.println("Введено не корректне значення");
                break;
        }
input.close();

    }
}
