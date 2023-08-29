package OpenWeaverVIP;

import java.util.Scanner;

public class TypeOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int number = scan.nextInt();

            if (number == 0) {
                System.out.println("The input number is zero");
                break;
            } else if (number < 0) {
                System.out.println(number + " is a negative number");

            } else {
                System.out.println(number + " is a positive number");

            }
        }
        scan.close();
    }
}