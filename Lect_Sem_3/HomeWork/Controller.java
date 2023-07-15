package Lect_Sem_3.HomeWork;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Controller {
    private static Scanner scanner = new Scanner(System.in);
    private static boolean flag = true;
    private static String userInput;
    private static String[] parsArray = new String[6];

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        while (flag) {
            View.startMenu();
            userInput = scanner.nextLine();

            if (userInput.equals("q")){flag = false;} 
            else if (userInput.equals("1")) {
                View.annotation();
                userInput = scanner.nextLine();
                if (userInput.split(" ").length != 6) {
                    throw new AmountOfDataException();
                } else {
                    parsArray = userInput.split(" ");
                    if (checkExceptions(parsArray)) {
                        Human newHuman = new Human(
                        parsArray[0], parsArray[1], parsArray[2], 
                        parsArray[3], parsArray[4], parsArray[5]);
                        write(newHuman, newHuman.getSurname());
                    }
                }
            }  
        }
    }

    private static boolean checkExceptions(String[] arr) throws RuntimeException{
        SimpleDateFormat myFormat = new SimpleDateFormat("dd.MM.yyyy");
        myFormat.setLenient(false);
        
        try {
            Integer.parseInt(arr[4]);
            myFormat.parse(arr[3]);
        } catch (NumberFormatException e){
            System.out.println("Невернй формат номера(только цифры 0123456789)");
            return false;
        } catch (ParseException e) {
            System.out.println("Неверный формат даты");
            return false;
        }
        if (!(arr[5].equals("f") || arr[5].equals("m"))) {
            System.out.println("Небинарный выбор пола, давай ка без повесточек!");
            return false;
        }
        return true;
        
        
    }
    private static void write(Human human, String path) {
        try (FileWriter fw = new FileWriter(human.getSurname() + ".txt", true)) {
            fw.write("<" + human.getSurname() + ">");
            fw.write("<" + human.getName() + ">");
            fw.write("<" + human.getFatherName() + ">");
            fw.write("<" + human.getBirthday() + ">");
            fw.write("<" + human.getPhoneNumber() + ">");
            fw.write("<" + human.getSex() + ">\n");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

