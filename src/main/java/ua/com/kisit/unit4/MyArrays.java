package ua.com.kisit.unit4;

import java.util.Arrays;
import java.util.Random;

public class MyArrays {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = new int[5];
        arr2[0] = 1;
        arr2[1] = 2;
        arr2[2] = 3;
        arr2[3] = 4;
        arr2[4] = 5;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        arr[3] = 10;

        // System.out.println(arr[5]);

        int[][] array = new int[4][4];
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[0][3] = 4;

        array[1][0] = 5;
        array[1][1] = 6;
        array[1][2] = 7;
        array[1][3] = 8;

        array[2][0] = 9;
        array[2][1] = 9;
        array[2][2] = 9;
        array[2][3] = 9;

        array[3][0] = 9;
        array[3][1] = 9;
        array[3][2] = 9;
        array[3][3] = 9;

        int [][] arr4 = new int[4][4];

        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                arr4[i][j] = new Random().nextInt(10);
            }
        }

        for (int i = 0; i < arr4.length; i++) {
            System.out.println(Arrays.toString(arr4[i]));
        }

        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }

    }
}
