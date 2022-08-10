import java.util.Arrays;
import java.util.Scanner;


public class CustomerArray {

     static int[] generateArray(int length){
        int[] array = new int[length];
        for(int i =0; i < array.length; i++){
            array[i] = ((int) (Math.random()* length));
        }
        return array;
    }


     static int arrayMax(int[] intArray){
         Arrays.sort(intArray);
         return intArray[intArray.length - 1];
    }

    static int arrayMin(int[] intArray){
        int min = intArray[0];
        for (int num : intArray) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    static int arraySum(int[] intArray){
         int sum = 0;
         for (int i = 0; i < intArray.length; i++){
             sum = sum + intArray[i];
         }
         return  sum;
    }

    static double arrayAverage(int[] intArray){
         double average = 0;
         if (intArray.length > 0){
             double sum = 0;
             for (int i = 0; i < intArray.length; i++){
                 sum += intArray[i];
             }
             average = sum / intArray.length;
         }
         return average;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введіть довжину массива: ");
        int length = input.nextInt();
        int[] array = generateArray(length);
        System.out.println("Массив має вигляд" + Arrays.toString(array));
        System.out.println("Максимальне значення массива:" + arrayMax(array));
        System.out.println("Мінімальне значення массива:" + arrayMin(array));
        System.out.println("Сумма всіх елементів массива:" + arraySum(array));
        System.out.println("Середньо арифметична сумма всіх елементів массива:" + arrayAverage(array));
    }
}

