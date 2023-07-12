package Lect_Sem_2;

import java.util.Scanner;

/*
Задание 1
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
public class HomeWork1 {
    public static void main(String[] args) {
        System.out.println(inputFloatNumber());
    }

    private static float inputFloatNumber(){
        boolean flag = true;
        Float floatNumber = null;
        Scanner scanner = new Scanner(System.in);
        while (flag) {
            System.out.println("Enter the float number, where the delimiter is '.'");
            String strFloatNumber = scanner.nextLine();
            try {
                floatNumber = Float.parseFloat(strFloatNumber);
                flag = false;
            } catch (NumberFormatException e) {
                System.out.println("Error! It's not a float number");
            }
        }
        return floatNumber;
    }
}
