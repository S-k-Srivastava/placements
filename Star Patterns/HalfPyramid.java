public class HalfPyramid {
    public static void main(String[] args) {
        printHalfPyramid();
    }

    static void printHalfPyramid() {
        int m = 4;
        int n = 1;// variable
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
            n++;
        }
    }
}
