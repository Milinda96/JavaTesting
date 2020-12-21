package javaTest.array.code;

public class Employee {
    int id;
    String name;
    Address address;

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {
        Address address1 = new Address("Wellawaya", "Monaragala", "Sri Lanka");
        Address address2 = new Address("Moratuwa", "Colombo", "Sri Lanka");

        Employee employee1 = new Employee(1, "Milinda", address1);
        Employee employee2 = new Employee(2, "Senaka", address2);

        employee1.displayInfo();
        employee2.displayInfo();

    }

    public void displayInfo() {
        System.out.println(id + " | " + name + " | " + address.city + " | " + address.state);
    }
}
