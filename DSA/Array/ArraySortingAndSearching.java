import java.util.Arrays;
import java.util.Scanner;

public class ArraySortingAndSearching extends ArrayBasics {
    public static void main(String[] args) {
        int[] arr = { 7, 4, 1, 9, 2, 5 };
        int[][] arr2d = { { 9, 4, 2, 1 }, { 2, 4, 45, 12 }, { 2, 5, 7, 1 } };
        Scanner sc = new Scanner(System.in);

        // Printing existing array

        System.out.println("Unsorted Array ....");
        System.out.println();
        print1DArray(arr);
        print2DArray(arr2d);

        // Sorting and Printing

        System.out.println("Sorted Array ....");
        System.out.println();

        // Arrays.sort(arr2d); sort only works for 1D array
        Arrays.sort(arr);

        print1DArray(arr);
        print2DArray(arr2d);

        // Searching Elements

        // 1D Searching

        System.out.println("Enter the element to search in 1D array : ");
        int key1D = sc.nextInt();
        int index1D = search1DArray(arr, key1D);
        if (index1D != -1) {
            System.out.println("Element Found at index : " + index1D);
        } else {
            System.out.println("Element Not Found!!");
        }

        // 2D Searching

        System.out.println("Enter the element to search in 2D array : ");
        int key2D = sc.nextInt();
        int[] index2D = search2DArray(arr2d, key2D);
        if (index1D != -1) {
            System.out.println("Element Found at index : " + "(" + index2D[0] + "," + index2D[1] + ")");
        } else {
            System.out.println("Element Not Found!!");
        }

    }

    public static int search1DArray(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int[] search2DArray(int[][] arr2d, int key) {
        int[] pos = new int[2];
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                if (arr2d[i][j] == key) {
                    pos[0] = i;
                    pos[1] = j;
                }
            }
        }
        return pos;
    }
}
