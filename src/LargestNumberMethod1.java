public class LargestNumberMethod1 {
    public static int largestNumber(int[] a, int len) {
        int temp;
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] =a[j];
                    a[j] = temp;
                }
            }
        }
        return a[len - 1];
    }
    public static void main(String args[]) {
        int a[] = {125, 25, 66, 96, 78};
        int b[] = {124, 98, 78, 36, 88, 99, 23};

        System.out.println(largestNumber(a, 5));
        System.out.println(largestNumber(b, 7));
    }
}
