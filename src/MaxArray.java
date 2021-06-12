import java.util.Scanner;

public class MaxArray {
    public static void main(String args[]) {
        int n, max;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the array items: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        max = a[0];
        for (int j = 0; j < a.length; j++) {
            if (max < a[j]) {
                max = a[j];
            }
        }
        System.out.println("Maximum number: " + max);
    }
}