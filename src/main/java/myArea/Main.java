package myArea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введіть раніус круга ");
        Scanner scan = new Scanner(System.in);
        double rad = scan.nextDouble();
        System.out.println("Площа круга S = " + MyArea.areaOfCircle(rad));
    }
}
