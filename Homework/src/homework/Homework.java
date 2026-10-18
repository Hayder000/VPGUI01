/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package homework;
import java.util.Scanner;
/**
 *
 * @author Hayder
 */
public class Homework {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Enter two numbers: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        System.out.println("Max = " + Math.max(a, b));


        System.out.print("How many numbers (n)? ");
        int n = in.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Number " + i + ": ");
            sum += in.nextDouble();
        }
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + (n > 0 ? sum / n : 0));


        System.out.print("Even numbers: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) System.out.print(i + " ");
        }
        System.out.println();


        System.out.print("Odd numbers: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Prime numbers: ");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
        System.out.println();

        in.close();
    }

    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

