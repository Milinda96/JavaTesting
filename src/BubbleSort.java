public class BubbleSort {
    public static void main(String args[]) {
        int a[] = { 10, 25, 266, 66, 45, 5599, 3, 87, 99, 5 };
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }
    }
}