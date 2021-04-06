public class SingletonA {
    public static SingletonA instance;
    private int i = 0;

    private SingletonA() {
    }

    public int numInc() {
        return ++i;
    }

    public static synchronized SingletonA getInstance() {
        if (null == instance) {
            instance = new SingletonA();
        }
        return instance;
    }
}