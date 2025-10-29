
import java.util.Scanner;

public class GCDWhile {
    public static Scanner input = new Scanner(System.in);

    public static int findGCD(int integer1, int integer2) {
        while (integer2 != 0) {
            int temp = integer2;
            integer2 = integer1 % integer2;
            integer1 = temp;
        }
        return integer1;
    }

    public static void main(String[] args) {
        int integer1, integer2;
        
        System.out.println("Enter Integer 1");
        integer1 = input.nextInt();
        System.out.println("Enter Integer 2");
        integer2 = input.nextInt();

        System.out.println("GCD is: " + findGCD(integer1, integer2));
    }
}
