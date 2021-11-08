package vehicle;

import interfaces.IPrintable;

//Class is abstract as not overloading the "printMyData() of "IPrintable" interface
abstract public class Vehicle implements IPrintable {
    private final String make;
    private final String plate;

    public Vehicle(String make, String plate) {
        this.make = make;
        this.plate = plate;
    }

    public String getMake() {
        return make;
    }

    public String getPlate() {
        return plate;
    }
}
