package Lab2.Lab2_Auto;

import java.util.ArrayList;

public class Garage {
    private ArrayList<Auto> masCar = new ArrayList<Auto>();

    public void addCar(Auto m) {
        masCar.add(m);
    }

    public void removeCar(int i) {
        masCar.remove(i);
    }

    public Garage() {
    }

    public Boolean findCar(Auto m) {
        return masCar.contains(m);
    }

    public Garage(ArrayList<Auto> n) {
        masCar = n;
    }

    public void printGarage() {
        Integer i = 0;
        System.out.println("В гараже: ");
        for (Auto a : masCar) { //
            i++;
            System.out.println("\t" + i + ") " + a.toString());
        }
    }
}