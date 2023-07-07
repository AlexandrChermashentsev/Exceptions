package Lect_sem_1;
import java.util.Random;

/*
4. НЕОБЯЗАТЕЛЬНО. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива
и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, то нужно как то оповестить пользователя. Важно: при выполнении метода, единственное
исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
 */
public class HW_4 {
    public static void main(String[] args) {
        // Подготовительныя часть для проверки
        Random rnd = new Random();
        int[] arr_1 = new int[10];
        int[] arr_2 = new int[10];
        float[] resultArr;
        if (arr_1.length == arr_2.length){
            for (int i = 0; i < arr_1.length; i++) {
                arr_1[i] = rnd.nextInt(100);
                arr_2[i] = rnd.nextInt(100);
            }
        } else {
            for (int i = 0; i < arr_1.length; i++) arr_1[i] = rnd.nextInt(100);
            for (int i = 0; i < arr_2.length; i++) arr_2[i] = rnd.nextInt(100);
        }

        
        for (int i : arr_1) System.out.print(i + " ");
        System.out.println("\n");

        for (int i : arr_2) System.out.print(i + " ");
        System.out.println("\n");
        resultArr = method(arr_1, arr_2);

        for (double i : resultArr) System.out.printf("%.2f ", i);
    }


    
    public static float[] method(int[] array_1, int[] array_2) {
        float[] result;
        if (array_1.length != array_2.length){
            throw new RuntimeException("Длины входных массивов не равны");
        } else {
            result = new float[array_1.length];
            for (int i = 0; i < result.length; i++) {
                if (array_2[i] != 0) {
                    result[i] = (float) array_1[i] / array_2[i];
                } else throw new RuntimeException("На ноль делить нельзя");
            }
        }
        return result;
    }
}
