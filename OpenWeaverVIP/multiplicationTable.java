package OpenWeaverVIP;

public class multiplicationTable {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================MULTIPLICATION TABLE==================================");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int product = i * j;
                System.out.print(i + "*" + j + "=" + product + calculateSpacing(product));
            }
            System.out.println();
        }
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "*" + 10 + "=" + 10 * i + "  ");
            // System.out.print(" ");
        }
    }

    static String calculateSpacing(int product) {
        return product > 9 ? "   " : "    ";
    }
}