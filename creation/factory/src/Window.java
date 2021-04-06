public interface Window {
    String getType();

    static Window createWindow(String type) {
        switch (type) {
            case "Big":
                return new WindowBig();
            case "Small":
                return new WindowSmall();
            default:
                throw new IllegalArgumentException("type not supported");
        }
    }
}