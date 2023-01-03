public class Rhombus {
    public static void main(String[] args) {
        printRhombus();
    }

    static void printRhombus() {
        int m = 5;
        for (int i = 1; i <= m; i++) {
            for (int k = 1; k <= m - i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= m; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
