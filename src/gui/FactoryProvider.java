package gui;

public class FactoryProvider {
    public static GUIFactory getFactory() {
        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            return new WindowsFactory();
        } else if (os.contains("mac")) {
            return new MacFactory();
        } else {
            throw new UnsupportedOperationException("Unsupported OS: " + os);
        }
    }
}
