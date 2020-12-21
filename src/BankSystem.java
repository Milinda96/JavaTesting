class BankSystem {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.insert(062, "Milinda Senaka", 200000);
        a1.display();
        a1.deposit((float) 35050.54);
        a1.checkBalance();
        a1.withdrawn(15000);
        a1.checkBalance();
    }
}

class Account {
    int account_number;
    String name;
    float amount;

    void insert(int acc, String name, float amnt) {
        this.account_number = acc;
        this.name = name;
        this.amount = amnt;
    }

    void deposit(float amnt) {
        amount = amount + amnt;
        System.out.println(amnt + "deposited");
    }

    void withdrawn(float amnt) {
        if (amount < amnt) {
            System.out.println("Insufficent Balance");
        } else {
            amount = amount - amnt;
            System.out.println(amnt + "Withdrawn");
        }
    }

    void checkBalance() {
        System.out.println("Balance is: " + amount);
    }

    void display() {
        System.out.println(account_number + " | " + name + " | " + amount);
    }
}
