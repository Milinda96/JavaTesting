package designPatterns;

public class FactoryMain {
    public static void main(String[] args) {
        FactoryController fs = new FactoryController();
        OS obj = fs.getOS("closed");
        obj.spec();
    }
}
