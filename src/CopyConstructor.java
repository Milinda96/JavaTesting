class CopyConstructor {

    int id;
    String name;

    CopyConstructor(int i, String n) {
        this.id = i;
        this.name = n;
    }

    CopyConstructor(CopyConstructor c) {
        this.id = c.id;
        this.name = c.name;
    }

    public static void main(String[] args) {
        CopyConstructor c = new CopyConstructor(1, "Milinda");
        CopyConstructor c1 = new CopyConstructor(c);

        c.display();
        c1.display();

    }

    void display() {
        System.out.println(id + " " + name);
    }
}
