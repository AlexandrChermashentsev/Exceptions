package Lect_sem_1;

import java.util.Random;

/*
3. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива
и возвращающий новый массив, каждый элемент которого равен разности элементов 
двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо оповестить пользователя.
 */
public class HW_3 {
    public static void main(String[] args) {
        // Подготовительныя часть для проверки
        Random rnd = new Random();
        int[] arr_1 = new int[10];
        int[] arr_2 = new int[10];
        int[] resultArr;
        if (arr_1.length == arr_2.length){
            for (int i = 0; i < arr_1.length; i++) {
                arr_1[i] = rnd.nextInt(10);
                arr_2[i] = rnd.nextInt(10);
            }
        } else {
            for (int i = 0; i < arr_1.length; i++) arr_1[i] = rnd.nextInt(10);
            for (int i = 0; i < arr_2.length; i++) arr_2[i] = rnd.nextInt(10);
        }

        
        resultArr = method(arr_1, arr_2);
        for (int i : resultArr) System.out.print(i + " ");
    }

    public static int[] method(int[] array_1, int[] array_2) {
        int[] result;
        if (array_1.length != array_2.length){
            throw new RuntimeException("Длины входных массивов не равны");
        } else {
            result = new int[array_1.length];
            for (int i = 0; i < result.length; i++) {
                result[i] = array_1[i] - array_2[i];
            }
        }
        return result;
    }
}
