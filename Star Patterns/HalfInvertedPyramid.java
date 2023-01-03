public class HalfInvertedPyramid {
    public static void main(String[] args) {
        printHalfInvertedPyramid();
    }

    static void printHalfInvertedPyramid() {
        int m = 4;
        int n = 4;// variable
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
            n--;
        }
    }
}
