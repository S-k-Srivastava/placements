public class InvertedNumberedHalfPyramid {
    public static void main(String[] args) {
        printInvertedNumberedHalfPyramid();
    }

    static void printInvertedNumberedHalfPyramid() {
        int m = 5;
        int n = 5;// variable
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            n--;
        }
    }

}
