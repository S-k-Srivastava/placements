import java.util.Scanner;;

public class S {
    public static void main(String[] args) {
        printS();
    }

    static void printS() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of S : ");
        int m = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            for (int k = 1; k <= m - i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= m; j++) {
                if (j == i || i == m) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= m; i++) {
            for (int k = 1; k <= m - i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= m; j++) {
                if (j == i) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
