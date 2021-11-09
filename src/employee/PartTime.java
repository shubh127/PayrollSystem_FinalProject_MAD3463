package employee;

import vehicle.Vehicle;

//Class is abstract as not overloading the "printMyData() of "IPrintable" interface
abstract public class PartTime extends Employee {
    private final double rate;
    private final double hoursWorked;

    public PartTime(String name,
                    int age,
                    Vehicle vehicle,
                    double rate,
                    double hoursWorked) {
        super(name, age, vehicle);
        this.rate = rate;
        this.hoursWorked = hoursWorked;
    }

    public double getRate() {
        return rate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    @Override
    double calcEarnings() {
        return rate * hoursWorked;
    }
}
