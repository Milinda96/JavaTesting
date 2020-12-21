class Factorial {
    public static void main(String[] args) {
        new Factorial().fac(10);
    }

    void fac(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial is " + fact);
    }

}
