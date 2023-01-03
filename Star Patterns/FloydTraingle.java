public class FloydTraingle {
    public static void main(String[] args) {
        printFloydTraingle();
    }

    static void printFloydTraingle() {
        int m = 5;
        int n = 1;// variable
        int count = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                count++;
                System.out.print(count + " ");
            }
            System.out.println();
            n++;
        }
    }
}
