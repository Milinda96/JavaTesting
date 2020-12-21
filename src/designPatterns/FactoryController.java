package designPatterns;

public class FactoryController {
    public OS getOS(String str) {
        if (str.equals("open")) {
            return new Android();
        } else {
            return new Apple();
        }
    }
}
