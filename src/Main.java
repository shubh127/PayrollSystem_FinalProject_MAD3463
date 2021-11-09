import employee.CommissionBasedPartTime;
import employee.FixedBasedPartTime;
import employee.FullTime;
import employee.Intern;
import vehicle.Car;
import vehicle.Motorcycle;

public class Main {
    public static void main(String[] args) {

        //Creating "Car" class objects
        Car car1 = new Car("BMW",
                "FGH8997",
                4,
                true);
        Car car2 = new Car("Mercedes",
                "YYT8978",
                2,
                false);

        //Creating "Motorcycle" class objects
        Motorcycle motorcycle1 = new Motorcycle("Harley-Davidson",
                "TG55RF",
                600,
                false);
        Motorcycle motorcycle2 = new Motorcycle("BMW",
                "YYT8765",
                250,
                true);

        //Creating "FullTime" class objects
        FullTime fullTimeEmployee1 = new FullTime("Michael Jackson",
                53,
                car1,
                5000,
                300);
        FullTime fullTimeEmployee2 = new FullTime("Brad Pitt",
                30,
                motorcycle2,
                4000,
                700);

        //Creating "Intern" class objects
        Intern internEmployee1 = new Intern("Sandra de Sa",
                60,
                motorcycle1,
                "Lambton College");
        Intern internEmployee2 = new Intern("Lisa Simpson",
                23,
                car2,
                "Lambton College Sarnia");

        //Creating "CommissionBasedPartTime" class objects
        CommissionBasedPartTime cbptEmployee1 = new CommissionBasedPartTime("John",
                25,
                car1,
                30,
                35,
                20);
        CommissionBasedPartTime cbptEmployee2 = new CommissionBasedPartTime("Wonder Woman",
                37,
                null,
                65,
                80,
                15);

        //Creating "FixedBasedPartTime" class objects
        FixedBasedPartTime fbptEmployee1 = new FixedBasedPartTime("Cindy",
                40,
                null,
                30,
                15,
                40);
        FixedBasedPartTime fbptEmployee2 = new FixedBasedPartTime("Peter Parker",
                40,
                motorcycle1,
                20,
                40,
                40);

        //Printing data by using "printMyData()" method for all the classes

        fullTimeEmployee1.printMyData();
        fullTimeEmployee2.printMyData();

        internEmployee1.printMyData();
        internEmployee2.printMyData();

        cbptEmployee1.printMyData();
        cbptEmployee2.printMyData();

        fbptEmployee1.printMyData();
        fbptEmployee2.printMyData();
    }
}
