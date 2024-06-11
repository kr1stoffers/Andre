package Lab2.Lab2_Auto;

import java.util.Scanner;

public class Test {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Car myCar1 = new Car("Ford", 200, "1337", "Mustang", 2, false);
        Car myCar2 = new Car();
        Car myCar3 = new Car("Mercedes", 300, "D875AA", "AMG s63", 4, true);

        Truck myTruck = new Truck("Jeep", 160, "T890RW", "Wrangler", 4, true);
        Truck myTruck2 = new Truck("Volvo", 100, "L876CS", "FH", 2, true);

        Garage garage = new Garage();
        garage.addCar(myCar1);
        garage.addCar(myCar2);
        garage.addCar(myCar3);
        garage.addCar(myTruck);
        garage.addCar(myTruck2);
        garage.printGarage();

        System.out.println("index? ");
        Integer i = in.nextInt();
        garage.removeCar(i - 1);

        garage.printGarage();
    }
}
