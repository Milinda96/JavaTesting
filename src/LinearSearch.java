public class LinearSearch {
    public static int search(int arr[], int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int arr[] = {1, 3, 6, 8, 78};
        int x = 2;
        int result = search(arr, x);
        if (result == -1) {
            System.out.println("Invalid");
        } else {
            System.out.println("Valid");
        }
    }
}
