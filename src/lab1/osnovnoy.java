package lab1;

import java.util.Random;
import java.util.Scanner;

//Задан массив действительных чисел. Определить, сколько раз меняется знак в данной последовательности чисел,
//напечатать номера позиций,в которых происходит смена знака

public class osnovnoy {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    private static void Lab1_ex1() {
        Integer[] numbers = new Integer[10];
        Integer k = 0;
        for (int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(20) - 10;
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 9; i++) {
            if (((numbers[i] > 0) && (numbers[i + 1] < 0)) || ((numbers[i] < 0) && (numbers[i + 1] > 0))) {
                k++;
                System.out.print(i + 1 + " ");
            }
        }
        System.out.println();
        System.out.println("count " + k);
    }

    // Дана прямоугольная матрица. Найти строку с наибольшей и наименьшей суммой
    // элементов. Вывести на печать найденные строки и суммы их элементов
    private static void Lab1_ex2() {
        System.out.print("row? ");
        Integer row = scanner.nextInt();
        System.out.print("col? ");
        Integer col = scanner.nextInt();
        Integer[][] matrix = new Integer[row][col];
        Integer max = 0;
        Integer min = 10000;
        Integer temp = 0;
        Integer index_max = 0;
        Integer index_min = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = random.nextInt(20);
                temp += matrix[i][j];
            }
            if (temp > max) {
                max = temp;
                index_max = i;
            }
            if (temp < min) {
                min = temp;
                index_min = i;
            }
            temp = 0;
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < col; i++) {
            System.out.print(matrix[index_min][i] + " ");
        }
        System.out.println("min = " + min);
        System.out.println();
        for (int i = 0; i < col; i++) {
            System.out.print(matrix[index_max][i] + " ");
        }
        System.out.println("max = " + max);
    }

    public static void main(String[] args) {
        Lab1_ex2();
    }
}
