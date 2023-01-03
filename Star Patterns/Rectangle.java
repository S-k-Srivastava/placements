public class Rectangle {
    public static void main(String[] args) {
        printRectangle();
    }

    static void printRectangle() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
