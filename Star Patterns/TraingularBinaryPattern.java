public class TraingularBinaryPattern {
    public static void main(String[] args) {
        printTraingularBinaryPattern();
    }

    static void printTraingularBinaryPattern() {
        int m = 5;
        int n = 1;// variable
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
            n++;
        }
    }
}
