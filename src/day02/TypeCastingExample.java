package day02;

public class TypeCastingExample {

    public static void main(String[] args) {

        // Implicit Type Casting
        int num = 50;
        long l = num;

        System.out.println("Implicit Casting");
        System.out.println("Integer : " + num);
        System.out.println("Long    : " + l);

        System.out.println();

        // Explicit Type Casting
        float f = 25.75f;
        int i = (int) f;

        System.out.println("Explicit Casting");
        System.out.println("Float   : " + f);
        System.out.println("Integer : " + i);

        System.out.println();

        // Type Promotion
        byte a = 10;
        byte b = 20;

        System.out.println("Byte Multiplication : " + (a * b));

        System.out.println("10 / 3 = " + (10 / 3));
        System.out.println("10 / 3.0 = " + (10 / 3.0));
    }
}