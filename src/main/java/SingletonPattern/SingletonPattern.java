package SingletonPattern;

public class SingletonPattern {
    public static void main(String[] args) {
        int i = 0;
        int k = 2;
        System.out.println(++i + i++ + ++k + i);
    }

}

class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return singleton;
    }
}
