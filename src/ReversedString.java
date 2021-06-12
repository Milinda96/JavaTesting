public class ReversedString {
    public static void main(String args[]) {
        String original = "Milinda Senaka";
        String reversed = "";

        for (int i = original.length()-1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
