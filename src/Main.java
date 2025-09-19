import gui.*;
import logistics.Logistics;
import logistics.RoadLogistics;
import logistics.SeaLogistics;


public class Main {
    public static void main(String[] args) {

        // Factory Method
        Logistics roadLogistics = new RoadLogistics();
        roadLogistics.planDelivery();

        Logistics seaLogistics = new SeaLogistics();
        seaLogistics.planDelivery();

        // Abstract Factory
        GUIFactory factory = FactoryProvider.getFactory();
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.render();
        checkbox.render();
    }
}