import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {


    static int[] arrayRandom(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()* 100);
        }
        return array;
    }

    static int bubbleSort(int[] array) {
        boolean status = true;
        int tmp;
        while (status) {
            status = false;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1]){
                    tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                    status = true;
                }
            }
        }
        System.out.println("Відсортованний масив Bubble Sort: " + Arrays.toString(array));
        return array[array.length-2];
    }

    static int selectionSort(int[] array) {
        int tmp;
        for (int i = 0; i < array.length-1; i++) {
            int min = i;
            for (int j = i+1; j < array.length; j++)
                if (array[j] < array[min])
                    min = j;
            tmp = array[min];
            array[min] = array[i];
            array[i] = tmp;
        }
        System.out.println("Відсортованний масив Selection Sort: " + Arrays.toString(array));
        return array[array.length-2];
    }

    static int sortSelection(int[] array, String type) {
        int result = 0;
        switch (type) {
            case "Bubble":
                result = bubbleSort(array);
                break;
            case "Selection":
                result = selectionSort(array);
                break;
            default:
                System.out.println("Помилка");
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введіть довжину массива: ");
        int length = input.nextInt();
        int[] array = arrayRandom(length);
        System.out.println("Массив має вигляд: " + Arrays.toString(array));
        System.out.print("Який тип сортування вибрати? (Bubble, Selection): ");
        String type = input.next();
        System.out.println("2ге саме велике число в массиві: - " + sortSelection(array, type));
    }
}