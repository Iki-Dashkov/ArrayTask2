package arrays;

import java.util.Arrays;

public class main {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 9, 32, 9, 18, 11};
        int sum = 0;
        int mult = 1;

        /* 2.Дан целочисленный массив с количеством элементов n. Напечатать те его элементы, индексы которых являются степенями двойки */
        for (int i = 0; i < array.length; i++) {
            if (((i & (i - 1)) == 0) && (i != 0)) {
                System.out.println("index " + i + " element " + array[i]);
            }
        }
        /*3.Найти сумму четных элементов массива целых чисел.*/
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum = sum + array[i];
            }
        }
        System.out.println("sum " + sum);

        /*4.Найти произведение элементов массива целых чисел, которые кратны 9. */
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 9 == 0) {
                mult = mult * array[i];
            }
        }
        System.out.println("multiplication " + mult);
        //8.
        int size = array.length;
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        System.out.print("reverse arrays ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        /*5.
        дерево 500sm
        1 = солнечный день (+2sm)
        0 = пасмурный день (-1sm)
         */
        int[] arrayMonth = new int[30];
        int distance = 3;
        int sunnyDay = 0;
        int nastyDay = 0;
        int result = 0;
        System.out.print("arrayMonth ");
        for (int i = 0; i < arrayMonth.length; i++) {
            arrayMonth[i] = ((int) (Math.random() * 2));
            System.out.print(arrayMonth[i] + " ");
        }

        for (int i = 0; i < arrayMonth.length; i++) {
            if (arrayMonth[i] == 1) {
                sunnyDay++;
            } else {
                nastyDay++;
            }
        }
        result = ((sunnyDay * 2) - nastyDay) + distance;
        System.out.println();
        System.out.println("result " + result);
        //6.
        int[] arrayP = {12, 64, 55, 66, 14, -120};
        int[] arrayR = {-123, -54, -110, 56, 12, -45};
        int[] arrayZ = new int[arrayP.length];
        int count = 0;
        int max = 0;
        int min = arrayZ[0];
        System.out.print("arrayZ ");
        for (int i = 0; i < arrayZ.length; i++) {
            arrayZ[i] = arrayP[i] + arrayR[i];
            System.out.print(arrayZ[i] + " ");
            if (max <= arrayZ[i]) {
                max = arrayZ[i];
            }
            if (arrayZ[i] > 0) {
                count++;
            }
            if (min > arrayZ[i]) {
                min = arrayZ[i];
            }
        }
        System.out.println();
        System.out.println("min " + min);
        System.out.println("max " + max);
        System.out.println("count " + count);

        //7.
        int[] arrayH = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arrayD = {12, 32, 4, 5, 68, 1, 3, 23, 10};

        for (int i = arrayD.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrayD[j] > arrayD[j + 1]) {
                    int tmp = arrayD[j];
                    arrayD[j] = arrayD[j + 1];
                    arrayD[j + 1] = tmp;
                }
            }
        }
        System.out.print("3 max ");
        for (int i = arrayD.length - 3; i < arrayD.length; i++) {
            System.out.print(arrayD[i] + " ");
        }
        System.out.println();
        System.out.print("3 min ");
        for (int i = 0; i <3; i++) {
            System.out.print(arrayD[i] +" ");
        }
    }

}
