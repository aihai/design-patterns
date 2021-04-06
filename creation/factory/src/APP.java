public class APP {
    public static void main(String[] args) {
        Window bigWindow = Window.createWindow("Big");
        System.out.println(bigWindow.getType().equals("Big"));

        Window smallWindow = Window.createWindow("Small");
        System.out.println(smallWindow.getType().equals("Small"));
    }

}
