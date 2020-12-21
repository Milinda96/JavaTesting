package javaTest.array.code;

class MinOrMax {
    static int getMin(int[] arr, int n) {
        int res = arr[0];
        for (int i = 1; i < n; i++) {
            res = Math.min(res, arr[i]);
        }
        return res;
    }
    static int getMax(int[] arr, int n) {
        int res = arr[0];
        for (int i = 1; i < n; i++) {
            res = Math.max(res, arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {12, 1245, 45, 65, 5};
        int n = arr.length;

        System.out.println("Minimum Element: " + getMin(arr, n));
        System.out.println("Maximum Element: " + getMax(arr, n));
    }
}
