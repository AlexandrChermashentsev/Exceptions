package Lect_Sem_2;
// Задание 2
// Если необходимо, исправьте код:

import java.util.Random;

public class HomeWork2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] arr = new int[10];
        arr[8] = rnd.nextInt(-10, 10);
        System.out.println("arr[8] = " + arr[8]);
        method(arr);
        methodMy1(arr);
        methodMy2(arr);
    }


    private static void method(int[] intArray) { // Изначальный метод
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } 
    }
    /*
    В этом методе я вынес за блок try-catch значение переменной, так как это бесмыслица какая то.
     */
    private static void methodMy1(int[] intArray) {
        int d = 0;
        try {
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } 
    }

    /*
    Если пользователю обязательно нужно получить double (не целочисленным делением),
    то я только додумался убрать блок try-catch
     */
    private static void methodMy2(int[] intArray) { 
        int d = 0;
        if (d != 0) {
            double catchedRes1 = (double) intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } else { 
            System.out.println("Ошибка, решением будет не число: " + (double) intArray[8] / d);
        }     
    }
}
