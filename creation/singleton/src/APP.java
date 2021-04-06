public class APP {

    public static void main(String[] args) {

        SingletonA a1 = SingletonA.getInstance();
        System.out.println(a1.numInc() == 1);

        SingletonA a2 = SingletonA.getInstance();
        System.out.println(a2.numInc() == 2);

        SingletonB b1 = SingletonB.getInstance();
        System.out.println(b1.numInc() == 1);

        SingletonB b2 = SingletonB.getInstance();
        System.out.println(b2.numInc() == 2);

        SingletonC c1 = SingletonC.INSTANCE;
        System.out.println(c1.numInc() == 1);

        SingletonC c2 = SingletonC.INSTANCE;
        System.out.println(c2.numInc() == 2);
    }
}