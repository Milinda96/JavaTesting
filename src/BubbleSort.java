public class BubbleSort {
    void bubblesort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void printArray(int arr[]) {
        int n= arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]) {
        BubbleSort bb = new BubbleSort();
        int arr[] = {44, 55, 68, 66, 22, 1, 36};
        bb.bubblesort(arr);
        System.out.println("Sorted Array");
        bb.printArray(arr);
    }
}