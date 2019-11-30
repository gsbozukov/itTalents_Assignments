package vignettes;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Random;

public class Driver {
    private static int nameIndex = 1;
    private String name;
    private HashSet<Vehicle> vehicles;
    private HashSet<Vignette> vignettes;
    private GasStation gasStation;
    private double money;
    private int outdatedVignettes;
    private int numOfCars;
    private int numOfVignettes;

    public int getNumOfVignettes() {
        return numOfVignettes = this.vignettes.size();
    }

    public Driver(GasStation gasStation) {
        this.name = "Driver"+nameIndex++;
        this.gasStation = gasStation;
        Random r = new Random();
        this.money = r.nextInt(2000)+2000;
        this.outdatedVignettes = 0;
        this.vehicles = new HashSet<>();
        this.vignettes = new HashSet<>();
    }
    public void addVehicle (Vehicle vehicle){
        this.vehicles.add(vehicle);
    }
    public void buyVignette (){
        //buy random vignette and store them
        Vignette newVignette = gasStation.sellVignette();
        this.money = this.money - newVignette.getPrice();
        this.vignettes.add(newVignette);
    }
    public void stickVignettes(){
        //goes through the whole list and calls the method in vignettes
        //for each vignette, check all cars
        for(Vignette v : this.vignettes){
            for(Vehicle vehicle:this.vehicles){
                if (compatible(vehicle, v)){
                    v.stickOn(vehicle);
                }

//                if (vehicle.getVignette()!=null){
//                    //if we stuck the vignette, break
//                    System.out.println(vehicle.getVignette());
//                    break;
//                }
            }
        }
    }
    private boolean compatible (Vehicle veh, Vignette v){
        if (veh.type.equals("Car")&&v.color.equals("Green") || veh.type.equals("Truck")&&v.color.equals("Yellow") ||
                veh.type.equals("Bus")&&v.color.equals("Red")){
            return true;
        }
        else return false;
    }
    public void checkValidity (LocalDate date){
        //for each vehicle, check if hasVignette is true, if not, print it
        for (Vehicle veh : this.vehicles){
            if (veh.getVignette() != null && veh.getVignette().getExpiryDate().isBefore(date)){
                System.out.println("The vehicule "+veh+"'s vignette is not valid anymore!");
                this.outdatedVignettes++;
            }
//            if (veh.getVignette() == null){
//                System.out.println(this.vignettes);
//                System.out.println("The vehicle "+veh+" has no vignette");
//            }
        }
        System.out.println("-----"+this.name+" has "+this.outdatedVignettes+" non valid vignettes ----");
    }

    public int getNumOfCars() {
        this.numOfCars = vehicles.size();
        return this.numOfCars;
    }

    public double getMoney() {
        return money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return name.equals(driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
