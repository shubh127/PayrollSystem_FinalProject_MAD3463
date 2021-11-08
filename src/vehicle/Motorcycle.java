package vehicle;

public class Motorcycle extends Vehicle {
    private final int cc;
    private final boolean hasPillionSeat;

    public Motorcycle(String make, String plate, int cc, boolean hasPillionSeat) {
        super(make, plate);
        this.cc = cc;
        this.hasPillionSeat = hasPillionSeat;
    }

    @Override
    public void printMyData() {
        String message = "Employee has a Motorcycle\n- " +
                getMake() +
                "\n- " +
                getPlate() +
                "\n- " +
                cc +
                " CC" +
                "\n- " +
                getPillionSeatMessage();
        System.out.print(message);
    }

    private String getPillionSeatMessage() {
        if (hasPillionSeat) {
            return "The motorcycle has a Pillion seat\n";
        }
        return "The motorcycle has no Pillion seat\n";
    }
}
