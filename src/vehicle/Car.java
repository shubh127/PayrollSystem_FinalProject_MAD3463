package vehicle;

public class Car extends Vehicle {
    private final int noOfDoors;
    private final boolean hasSunRoof;

    public Car(String make,
               String plate,
               int noOfDoors,
               boolean hasSunRoof) {
        super(make, plate);
        this.noOfDoors = noOfDoors;
        this.hasSunRoof = hasSunRoof;
    }

    @Override
    public void printMyData() {
        String message = "Employee has a Car\n- " +
                getMake() +
                "\n- " +
                getPlate() +
                "\n- " +
                noOfDoors +
                " doors\n- " +
                getRoofTopMessage();
        System.out.print(message);
    }

    private String getRoofTopMessage() {
        if (hasSunRoof) {
            return "The car has Sunroof\n";
        }
        return "The car has no sunroof\n";
    }
}
