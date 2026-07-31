package day03;

import java.util.Scanner;

public class GreatestNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        System.out.print("Enter third number: ");
        int z = sc.nextInt();

        if (x > y && x > z) {

            System.out.println(x + " is the greatest.");

        } else if (y > x && y > z) {

            System.out.println(y + " is the greatest.");

        } else {

            System.out.println(z + " is the greatest.");

        }

        sc.close();
    }
}