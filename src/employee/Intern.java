package employee;

import vehicle.Vehicle;

public class Intern extends Employee {

    private final String schoolName;

    public Intern(String name,
                  int age,
                  Vehicle vehicle,
                  String schoolName) {
        super(name, age, vehicle);
        this.schoolName = schoolName;
    }

    @Override
    public void printMyData() {
        StringBuilder message = new StringBuilder();
        message.append("\nName: ");
        message.append(getName());
        message.append("\n");
        message.append("Year of Birth: ");
        message.append(calcBirthYear());
        message.append("\n");
        System.out.print(message);
        message.setLength(0);
        if (getVehicle() == null) {
            message.append("Employee has no Vehicle registered");
        } else {
            getVehicle().printMyData();
        }
        message.append("\nEmployee is Intern\n- School Name: ");
        message.append(schoolName);
        message.append("\n- Earnings: ");
        message.append((int) calcEarnings());
        message.append("\n____________________________________________________________");
        System.out.print(message);
    }
}
