public class WindowFactory {

    public static Window create(String type) {
        if (type.toLowerCase().equals("big")) {
            return new WindowBig();
        } else if (type.toLowerCase().equals("small")) {
            return new WindowSmall();
        } else {
            return new WindowBig();
        }
    }
}