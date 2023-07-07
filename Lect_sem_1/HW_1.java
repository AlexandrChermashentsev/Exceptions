package Lect_sem_1;

// 1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
public class HW_1 {
    public static void main(String[] args) {
        // int a = -1;
        // method_1(a); // Будет ошибка ArrayIndexOutOfBoundsException 
        //(Заданно значение индекса массива, не принадлежащее допустимому диапазону)

        // int b = 1;
        // method_2(b); // ClassCastException (Ошибка приведения типов)
        
        // int c = -1;
        // method_3(c); // NegativeArraySizeException
        // (Попытка создания массива с размером значение которого задано отрицательным числом)
    }
    

    public static void method_1(int a){
        int[] ints = new int[10];
        System.out.println(ints[a]);            
    }

    public static <T> void method_2(int b) {
        T bValue = (T) "qwerty";
        int[] ints = new int[10];
        ints[b] = (int) bValue;
    }

    public static void method_3(int c) {
        int[] array = new int[c];
    }
}
