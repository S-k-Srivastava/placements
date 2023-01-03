public class RotatedHalfInvertedPyramid {
    public static void main(String[] args) {
        printRotatedHalfInvertedPyramid();
    }

    static void printRotatedHalfInvertedPyramid() {
        int m = 4;
        int n = 1;// variable
        for (int i = 1; i <= m; i++) {
            for (int k = 1; k <= m - n; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
            n++;
        }
    }
}
