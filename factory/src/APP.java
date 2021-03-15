public class APP {
    public static void main(String[] args) {
        Window bigWindow = WindowFactory.create("Big");
        bigWindow.func();

        Window smallWindow = WindowFactory.create("Small");
        smallWindow.func();
    }

}
