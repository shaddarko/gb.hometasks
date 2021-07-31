public class HomeTask3 {
    public static void main(String[] args) {

        /*Задать целочисленный массив, состоящий из элементов 0 и 1.
        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;*/

        int[] nums = {1, 0, 0, 1, 1, 0};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                nums[i] = 0;
            } else {
                nums[i] = 1;
            }
            System.out.println(nums[i]);
        }
        System.out.println("____________");

        /*Задать пустой целочисленный массив длиной 100.
        С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;*/

        int[] oneHundredNumbers = new int[100];
        for (int i = 0; i < oneHundredNumbers.length; i++) {
            oneHundredNumbers[i] = i + 1;
            System.out.println(oneHundredNumbers[i]);
        }
        System.out.println("____________");


        /*Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        пройти по нему циклом, и числа меньшие 6 умножить на 2;*/

        int[] multiplyOnTwo = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < multiplyOnTwo.length; i++) {
            if (multiplyOnTwo[i] < 6) {
                multiplyOnTwo[i] *= 2;
            }
            System.out.println(multiplyOnTwo[i]);
        }


        System.out.println("____________");

        /*Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
         и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
         Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
         то есть [0][0], [1][1], [2][2], …, [n][n];*/


        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (i == j) {
                    arr1[i][j] = 1;
                }
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println("____________");

        /*Задать одномерный массив и найти в нем минимальный и максимальный элементы ;*/


        int[] arr = {4, 5, 3, 2, 11, 4, 5, 1, 4, 8, 9, 1};
        int max = 0;
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];

            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println("____________");


        returnArray(3, 7);


    }

    /*Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len,
     каждая ячейка которого равна initialValue;*/

    public static int[] returnArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
            System.out.println(array[i]);
        }
        return array;
    }
}




