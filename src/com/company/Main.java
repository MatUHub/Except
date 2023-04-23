package com.company;

public class Main {

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5, 6, 7, 8, 9};
        int[] arr2 = {1, 2, 3, 5, 4, 2, 7};

        printArr(sumArray(arr1, arr2));
// Ошибка с длинной массива
//      int[] arr3 = {1, 3, 5, 6, 7, 8};
//      int[] arr4 = {1, 2, 3, 5, 4, 2, 7};
//
//        printArr(sumArray(arr3, arr4));
// Ошибка с делением на ноль
        int[] arr3 = {1, 3, 5, 6, 7, 8, 5};
        int[] arr4 = {1, 2, 3, 0, 4, 2, 7};

        printArr(divArr(arr3, arr4));
    }

    public static int[] sumArray(int[] arr1, int[] arr2) {
        int[] arr3;

        if (arr1.length != arr2.length) {
            throw new RuntimeException("Массивы не равны");
        }
        arr3 = new int[arr1.length];

        for (int i = 0; i < arr3.length; i++) {

            if ((arr1[i] - arr2[i]) < 0) {
                arr3[i] = (arr1[i] - arr2[i]) * -1;
            } else arr3[i] = arr1[i] - arr2[i];
        }
        return arr3;
    }

    public static int[] divArr(int[] arr1, int[] arr2) {
        int[] arr3;

        if (arr1.length != arr2.length) {
            throw new RuntimeException("Массивы не равны");
        }
        arr3 = new int[arr1.length];

        for (int i = 0; i < arr3.length; i++) {
            if (arr1[i] == 0 || arr2[i] == 0) {
                throw new RuntimeException("Делить на ноль нельзя");
            } else arr3[i] = arr1[i] / arr2[i];
        }
        return arr3;
    }


    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(",");
            } else System.out.println();
        }
    }
}
