public class NumberedPyramid {
    public static void main(String[] args) {
        printNumberedPyramid();
    }

    static void printNumberedPyramid() {
        int m = 5;
        int n = 1;// variable
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            n++;
        }
    }
}
