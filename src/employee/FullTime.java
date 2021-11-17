package employee;

import vehicle.Vehicle;

public class FullTime extends Employee {
    private final double salary;
    private final double bonus;

    public FullTime(String name,
                    int age,
                    Vehicle vehicle,
                    double salary,
                    double bonus) {
        super(name, age, vehicle);
        this.salary = salary;
        this.bonus = bonus;
    }

    @Override
    public double calcEarnings() {
        return salary + bonus;
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
        message.append("Employee is FullTime\n- Salary: ");
        message.append(salary);
        message.append("\n- Bonus: ");
        message.append(bonus);
        message.append("\n- Earnings: ");
        message.append(calcEarnings());
        message.append("\n______________________________");
        System.out.print(message);
    }
}
