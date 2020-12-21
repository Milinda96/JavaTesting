class Student {
    int rollNo;
    String name;

    void studentRecords(int r, String n) {
        this.rollNo = r;
        this.name = n;
    }

    void showStudentDeatils() {
        System.out.println("ID: " + this.rollNo + " " + "Name: " + this.name);
    }
}

class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.studentRecords(100, "Milinda");
        s2.studentRecords(101, "Senaka");

        s1.showStudentDeatils();
        s2.showStudentDeatils();
    }
}
