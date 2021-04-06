

public class SingletonB {

    private static SingletonB instance = new SingletonB();
    private int i;

    public int numInc() {
        return ++i;
    }

    public static SingletonB getInstance() {
        return instance;
    }
}