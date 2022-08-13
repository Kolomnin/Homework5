
import java.util.*;


public class Main {
    public static void main(String[] args) {
       task1and2();
       task3();
       task4();
       task5();
       task6();
       task7();
       task8();
       task9();
    }

    // Задание №1 и №2
    public static void task1and2() {
        System.out.println("\n" + "Задание 1 и 2");
        int[] index = new int[3];
        index[0] = 1;
        index[1] = 2;
        index[2] = 3;

        for (int i = 0;i<index.length-1; i++) {
        if(i == index.length-1)
            System.out.printf("%s ",index[i]);
        else
            System.out.printf("%s, ",index[i]);
        }
        System.out.println("\n");

        double[] arr1 = {1.57, 7.654, 9.986};
        for (double j = 0; j<arr1.length; j++) {
            if(j==arr1.length-1)
                System.out.printf("%s ",arr1[(int) j]);
            else
                System.out.printf("%s, ",arr1[(int) j]);
        }
        System.out.println("\n");

        char[] arr2 = {113,166,167,687,993,654};
        for (char c = 0; c < arr2.length; c++) {
            if(c==arr2.length-1)
                System.out.printf("%s ",arr2[c]);
            else
                System.out.printf("%s, ",arr2[c]);
        }
        System.out.println("\n");
    }

   // Задаине №3
    public static void task3() {

            int[] index1 = new int[3];
            index1[0] = 1;
            index1[1] = 2;
            index1[2] = 3;

            for (int i = index1.length -1; i >= 0; i--) {

                if (i == index1.length - 1) {
                    System.out.printf(" %s", index1[i]);
                } else {
                    System.out.printf(", %s", index1[i]);
                }
            }
        System.out.println("\n");

            double[] arr11 = {1.57, 7.654, 9.986};
            for (double j = arr11.length-1; j >=0 ; j--) {
                if (j == arr11.length -1 )
                    System.out.printf(" %s", arr11[(int) j]);
                else
                    System.out.printf(", %s", arr11[(int) j]);
            }
        System.out.println("\n" + "Задание 3");

            char[] arr22 = {113, 166, 167, 687, 993, 654};
            for (char c = (char) (arr22.length - 1); c < arr22.length  ; c--) {
                if (c == arr22.length -1 )
                    System.out.printf(" %s", arr22[c]);
                else
                    System.out.printf(", %s", arr22[c]);

        }

        System.out.println("\n" + "Задание 4");
    }

    // Задание №4
    public static void task4() {
        int[] index3 = new int[5];
        index3[0] = 1;
        index3[1] = 2;
        index3[2] = 3;
        index3[3] = 4;
        index3[4] = 5;

        for (int i = 0; i < index3.length; i++)
        {
            if (!(index3[i]%2==0)) {
                index3[i] = index3[i]+1;
            }
                System.out.printf("%s ", index3[i]);

        }
    }

  /*  Создайте матрицу 3х3 (двумерный массив типа int). Заполните единицами обе диагонали матрицы и напечатайте
  ее в консоль. Постарайтесь заполнить обе диагонали в одном цикле.
    Для печати следует использовать следующий код:
            for (int[] row : matrix) {
        for (int column : row) {
            System.out.print(column + " ");
        }
        System.out.println();
    }
    Критерии оценки:
            – В консоль выводится матрица 3х3 со значениями единицы по диагонали.
            – При изменении единицы на другое значение матрица выводится в консоль корректно.
            – Для вывода результата в консоль используется один цикл.*/

    // Задание №5
    public static void task5() {
        System.out.println("\n" + "Задание 5");
        int size = 3;
        int m = 1;
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
                array[i][i] = m;
                array[i][size-i-1] = m;
        }

        for (int[] row : array) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    //Задание №6

//    У нас есть массив, в котором содержатся целочисленные значения от 1 до 5.
//    Наш коллега что-то напутал, в итоге массив читается не с начала, а с конца.
//    Нам нужно исправить ошибку и переработать код так, чтобы массив читался в правильном порядке.
//    Нам дан массив чисел: {5, 4, 3, 2, 1}
//    Необходимо привести его к виду: {1, 2, 3, 4, 5}
//    Решите задачу с использованием дополнительного массива.
//    Напечатайте массив до преобразования и после с помощью
//System.out.println(Arrays.toString(arr));
//    Критерии оценки:
//            – В консоль выведен результат программы до преобразований массива.
//            – В консоль выведен результат программы после преобразований массива.
//            – Программа выводит корректный результат при смене значений внутри массива.

    // Задание №6
    public static void task6() {
        System.out.println("\n" + "Задание 6");
        int[] array = {5,4,3,2,1};
        System.out.println(Arrays.toString(array));
        int temp;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("\n");
    }
    // Задание №7
    public static void task7() {
        System.out.println("\n" + "Задание 7");
        int[] array = {5, 8, 2, 3, 9};
        System.out.println(Arrays.toString(array));
        int[] reverse = new int[array.length];
        int x = 0;
        for (int i = 1; i <= array.length; i++) {
            reverse[x++] = array[array.length - i];
        }
        System.out.println(Arrays.toString(reverse));
        System.out.println("\n");
    }
    // Задание №8
    public static void task8() {
        System.out.println("\n" + "Задание 8");
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        for (int i : arr) {
            for (int j : arr) {
                if (i + j == -2) {
                    System.out.println(j + ", " + i);
                } else { break;}
            }
        }
    }
    // Задание №9
    public static void task9() {
        System.out.println("\n" + "Задание 9");
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        for (int i : arr) {
            for (int j : arr) {
                if (i + j == -2) {
                    System.out.println(j + ", " + i);
                }
            }
        }
    }
}

