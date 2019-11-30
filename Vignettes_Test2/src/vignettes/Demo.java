package vignettes;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        GasStation gasStation = new GasStation();
        //initial print
        gasStation.printVignettes();
        HashSet <Driver> drivers = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            drivers.add(new Driver(gasStation));
        }
        HashSet <Vehicle> vehicles = new HashSet<>();
        for (int i = 0; i < 200; i++) {
            Random r = new Random();
            switch (r.nextInt(3)){
                case 0: vehicles.add(new Car());
                break;
                case 1: vehicles.add(new Truck());
                break;
                default: vehicles.add(new Bus());
                break;
            }
        }
        //distribute vehicles
        Iterator<Vehicle> it = vehicles.iterator();
        for (Driver driver : drivers){
            if (it.hasNext()){
                for (int i = 0; i < 10; i++) {
                    driver.addVehicle(it.next());
                }
            }
        }
        //1/3 buys 5 vignettes, 2/3 buy 10
        for (Driver driver:drivers){
            Random r = new Random();
            if (r.nextInt(3) == 0){
                for (int i = 0; i < 5; i++) {
                    driver.buyVignette();
                }
            }
            else {
                for (int i = 0; i < 10; i++) {
                    driver.buyVignette();
                }
            }
            driver.stickVignettes();
        }
        //print info
        LocalDate date = LocalDate.of(2019, 8, 30);
        for (Driver driver : drivers){
            driver.checkValidity(date);
            System.out.println("The driver "+driver+" has "+driver.getNumOfCars()+" cars");
            System.out.println("The driver "+driver+" has "+driver.getMoney()+" BGN");
        }
        gasStation.vignettesLeft();
    }
}
