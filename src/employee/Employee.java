package employee;

import interfaces.IPrintable;
import vehicle.Vehicle;

//Class is abstract as not overloading the "printMyData() of "IPrintable" interface
abstract public class Employee implements IPrintable {
    private final String name;
    private final int age;
    private final Vehicle vehicle;

    public Employee(String name, int age, Vehicle vehicle) {
        this.name = name;
        this.age = age;
        this.vehicle = vehicle;
    }

    int calcBirthYear() {
        return 2021 - age;
    }

    double calcEarnings() {
        return 1000;
    }

    public String getName() {
        return name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
