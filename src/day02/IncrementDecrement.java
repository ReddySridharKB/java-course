package day02;

import java.util.Scanner;

public class IncrementDecrement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        System.out.println("Original Value : " + a);

        System.out.println("Post Increment (a++) : " + (a++));
        System.out.println("Current Value         : " + a);

        System.out.println("Pre Increment (++a)  : " + (++a));
        System.out.println("Current Value         : " + a);

        System.out.println("Post Decrement (a--) : " + (a--));
        System.out.println("Current Value         : " + a);

        System.out.println("Pre Decrement (--a)  : " + (--a));
        System.out.println("Current Value         : " + a);

        sc.close();
    }
}