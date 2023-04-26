package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args)  {
//Task1
      /*  boolean a = true;
        float num;
        while (a) {
            System.out.println("Ведите число:");
            Scanner scanner = new Scanner(System.in);
            try {
                num = scanner.nextFloat();
                a = false;
                System.out.println("число равно " + num);
                scanner.close();
            } catch (Exception e) {
                System.out.println("Введено не число, попытайтесь снова");
            }
        }
*/
//Task2

       /* ArrayList<Integer> intArray = new ArrayList<Integer>();
        intArray.add(1);
        intArray.add(2);
        intArray.add(3);
        intArray.add(4);
        intArray.add(5);
        intArray.add(6);
        intArray.add(7);
        intArray.add(8);
        intArray.add(9);

        try {
            int d = 0;
            int catchedRes1 = intArray.get(8) / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
*/
//Task3

        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        }  catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }

}

