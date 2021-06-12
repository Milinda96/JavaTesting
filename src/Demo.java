class A {
    void msg() {
        System.out.println("Hello");
    }
}

class B {
    void msg1() {
        System.out.println("Welcome");
    }
}

class Demo extends A, B {

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.msg();//Now which msg() method would be invoked?
    }
}