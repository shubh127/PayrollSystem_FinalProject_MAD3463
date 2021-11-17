package employee;

import vehicle.Vehicle;

public class CommissionBasedPartTime extends PartTime {
    private final double commission;

    public CommissionBasedPartTime(String name,
                                   int age,
                                   Vehicle vehicle,
                                   double rate,
                                   double hoursWorked,
                                   double commission) {
        super(name, age, vehicle, rate, hoursWorked);
        this.commission = commission;
    }

    @Override
    public double calcEarnings() {
        return commission + super.calcEarnings();
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
        message.append("Employee is PartTime / Commissioned\n- Rate: ");
        message.append((int) getRate());
        message.append("\n- Hours Worked: ");
        message.append((int) getHoursWorked());
        message.append("\n- Commission: ");
        message.append((int) commission);
        message.append("%\n- Earnings: ");
        message.append(String.format("%.2f", calcEarnings()));
        message.append(" (");
        message.append((int) super.calcEarnings());
        message.append(" + 20% of ");
        message.append((int) super.calcEarnings());
        message.append(")\n____________________________________________________________");
        System.out.print(message);
    }
}
