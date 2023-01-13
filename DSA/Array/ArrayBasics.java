public class ArrayBasics {
    public static void main(String[] args) {

        // declaration
        int[] arr = new int[5];
        int[][] arr2d = new int[5][4];

        // can also directly initilise as :
        // int[] arr = {1,2,4,5,6};

        // initilise using loop

        System.out.println("Initialising...");

        // 1d
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        // 2d
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                arr2d[i][j] = i + j;
            }
        }

        // printing

        System.out.println("Printing...");
        print1DArray(arr);
        print2DArray(arr2d);

        // updating

        System.out.println("Updating...");
        arr[2] = 1322;
        arr2d[1][2] = 2515;
        print1DArray(arr);
        print2DArray(arr2d);

    }

    public static void print1DArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void print2DArray(int[][] arr2d) {
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
