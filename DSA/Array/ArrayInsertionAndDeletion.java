public class ArrayInsertionAndDeletion extends ArrayBasics {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };

        // Printing Orignal Array

        print1DArray(arr);

        // Inserting 233 at 3 and printing...

        System.out.println("Inserting 233 at 3...");
        System.out.println();

        arr = insert1D(arr, 3, 234);

        print1DArray(arr);

        // Deleteing at 3 and printing...

        System.out.println("Deleting at 3...");
        System.out.println();

        arr = delete1D(arr, 3);

        print1DArray(arr);
    }

    public static int[] insert1D(int[] arr, int pos, int element) {
        int[] newArray = new int[arr.length + 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i < pos) {
                newArray[i] = arr[i];
            } else if (i == pos) {
                newArray[i] = element;
            } else if (i > pos) {
                newArray[i] = arr[i - 1];
            }
        }
        return newArray;
    }

    public static int[] delete1D(int[] arr, int pos) {
        int[] newArray = new int[arr.length - 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i < pos) {
                newArray[i] = arr[i];
            } else {
                newArray[i] = arr[i + 1];
            }
        }
        return newArray;
    }
}
