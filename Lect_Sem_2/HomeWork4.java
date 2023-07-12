package Lect_Sem_2;

import java.util.Scanner;

/*
Задание 4
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class HomeWork4 {
    public static void main(String[] args) {
        inputUser();
    }

    public static void inputUser() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Введите данные:");
            String userInput = scanner.nextLine();
            if (userInput.isEmpty() || userInput.isBlank()){
/*
isBlank - Метод проверки на пустоту (одни пробелы) строки. Этот метод не создает новую строку в куче. 
Доступен только с java 11
*/
                try {
                    userInput = null;
                    System.out.println(userInput.length());
                    flag = false;
                } catch (NullPointerException e) {
                    System.out.println("Пустые строки вводить нельзя! ");
                }
            } else flag = false; 
        }
    }
}
