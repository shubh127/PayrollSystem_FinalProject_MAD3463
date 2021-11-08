package employee;

import vehicle.Vehicle;

public class FixedBasedPartTime extends PartTime {
    private final double fixedAmount;

    public FixedBasedPartTime(String name, int age, Vehicle vehicle, double rate, double hoursWorked, double fixedAmount) {
        super(name, age, vehicle, rate, hoursWorked);
        this.fixedAmount = fixedAmount;
    }

    @Override
    double calcEarnings() {
        return fixedAmount + super.calcEarnings();
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
        message.append("Employee is PartTime / Fixed Amount\n- Rate: ");
        message.append((int) getRate());
        message.append("\n- Hours Worked: ");
        message.append((int) getHoursWorked());
        message.append("\n- Fixed Amount: ");
        message.append(String.format("%.2f", fixedAmount));
        message.append("\n- Earnings: ");
        message.append(String.format("%.2f", calcEarnings()));
        message.append(" (");
        message.append((int) super.calcEarnings());
        message.append(" + ");
        message.append(String.format("%.2f", fixedAmount));
        message.append(")");
        message.append("\n____________________________________________________________");
        System.out.print(message);
    }
}
