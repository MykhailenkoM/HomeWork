package rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Rectangle rectangle = new Rectangle();
        System.out.println("Введіть довжину першого ребра прамокутника: ");
        Scanner scan = new Scanner(System.in);
        double side1 = scan.nextDouble();

        System.out.println("Введіть довжину другого ребра прамокутника: ");
        scan = new Scanner(System.in);
        double side2 = scan.nextDouble();

        System.out.println("Периметр прямокутника = " + rectangle.perimeterCalculator(side1,side2));
        System.out.println("Площа прямокутника = " + rectangle.areaCalculator(side1,side2));

    }
}
