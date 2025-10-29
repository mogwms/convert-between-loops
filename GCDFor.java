
import java.util.Scanner;


public class GCDFor {
    public static int findGCD(int integer1, int integer2) {
        for (; integer2 != 0;) {
            int temp = integer2;
            integer2 = integer1 % integer2;
            integer1 = temp;
        }
        return integer1;
    }

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int integer1, integer2;

        System.out.println("Enter Integer 1");
        integer1 = input.nextInt();
        System.out.println("Enter Integer 2");
        integer2 = input.nextInt();

        System.out.println("GCD is: " + integer1);
    }
}