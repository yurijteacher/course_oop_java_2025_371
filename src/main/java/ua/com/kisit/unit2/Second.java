package ua.com.kisit.unit2;

import java.util.Arrays;

public class Second {

    public static void main(String[] args) {


        byte b = 12;
        System.out.println(b);
        short s = 12;
        System.out.println(s);
        int i = 12;
        System.out.println(i);
        long l = 12L;
        System.out.println(l);

        float f = 12F;
        System.out.println(f);
        double d = 12D;
        System.out.println(d);

        char c = 'A';
        System.out.println(c);
        boolean logic = true;
        System.out.println(logic);

        String str = "Hello World";
        System.out.println(str);
        System.out.println(str.hashCode());

        str = "Hello World" + "!";
        System.out.println(str.hashCode());

        String str2 = "Hello World!";
        System.out.println(str2.hashCode());

        int[] arr2 = new int[3];

        arr2[0] = 1;
        arr2[1] = 2;
        arr2[2] = 3;

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(arr));

        // for

        for (int j = 0; j < arr2.length; j++) {
            System.out.println(arr2[j]);
        }

        int j = 0;

        for (; j < arr2.length; ) {
            System.out.println(arr2[j]);
            j++;
        }

//        j = 0;
//        for (; ; ) {
//            System.out.println(j);
//            j++;
//        }

        // while
        j = 0;
        while (j < arr2.length) {
            System.out.println(arr2[j]);
            j++;
        }

        // do-while
        j = 0;
        do {
            System.out.println(arr2[j]);
            j++;
        } while (j < arr2.length);

        // v.7
        for (int el : arr) System.out.println(el);

        // stream
        Arrays.stream(arr).forEach(x -> System.out.println(x));

        int[][] arr3 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[][] arr4 = new int[3][3];

        int[][] arr5 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
        };

        for (int k = 0; k < arr5.length; k++) {
            System.out.println(Arrays.toString(arr5[k]));
        }

        for (int k = 0; k < arr5.length; k++) {
            for (int m = 0; m < arr5[k].length; m++) {
                System.out.print(arr5[k][m] + ", ");
            }
            System.out.println();
        }


        logic = false;
        if (!logic) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }

        logic = (!logic) ? false : true;

        String operation = "+";

        switch (operation) {
            case "+":
                System.out.println("sum");
                break;
            case "-":
                System.out.println("sub");
                break;
            case "*":
                System.out.println("mul");
                break;
            case "/":
                System.out.println("div");
                break;
        }

        for (int k = 0; k < 10; k++) {

            if(k > 3) {
                break;
            }
            System.out.println(k);
        }

        for (int k = 0; k < 10; k++) {
            if(k < 3) {
                continue;
            }
            System.out.println(k);
        }

    }
}
