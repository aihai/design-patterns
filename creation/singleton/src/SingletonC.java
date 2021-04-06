public enum SingletonC {

    INSTANCE;

    private int i;

    public int numInc() {
        return ++i;
    }
}