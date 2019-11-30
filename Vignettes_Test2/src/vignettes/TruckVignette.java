package vignettes;

public class TruckVignette extends Vignette {
    public TruckVignette() {
        super();
        super.price = super.price*7;
        super.color = "Yellow";
    }

    @Override
    public void stickOn(Vehicle vehicle) {
        if (vehicle.getVignette() == null && vehicle.type.equals("Truck")){
            vehicle.setVignette(this);
            System.out.println("Sticking vignette on "+vehicle+" for 10 seconds.");
        }
    }
}
