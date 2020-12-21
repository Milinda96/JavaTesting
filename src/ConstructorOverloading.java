class ConstructorOverloading {
    int id;
    String name;
    int age;

    ConstructorOverloading(int i, String n) {
        this.id = i;
        this.name = n;
    }

    ConstructorOverloading(int i, String n, int a) {
        this.id = i;
        this.name = n;
        this.age = a;
    }

    public static void main(String[] args) {
        ConstructorOverloading s1 = new ConstructorOverloading(1, "Milinda");
        ConstructorOverloading s2 = new ConstructorOverloading(2, "Senaka", 24);

        s1.display();
        s2.display();
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }
}
