package Lect_sem_1;
// 2. Посмотрите код и подумайте сколько разных типов исключений вы тут сможете получить?

import java.util.Random;

public class HW_2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        String[][] arr = new String[x][y];
        Random rnd = new Random();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = Integer.toString(rnd.nextInt(2));
                if (j == 5) System.out.print("| ");
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        arr[1][2] = "0.12";

        System.out.println(sum2d(arr));
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}

/*
 * NumberFormatException - при пустом значении ячейки в массиве или если ячейка будет содержать
что то кроме целого числа (в формате строки).

* ArrayIndexOutOfBoundsException - Неправильно описаны границы цикла в методе.
 */