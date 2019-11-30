package vignettes;

public class CarVignette extends Vignette {
    public CarVignette() {
        super();
        super.price = super.price*5;
        super.color = "Green";
    }

    @Override
    public void stickOn(Vehicle vehicle) {
        if (vehicle.getVignette() == null && vehicle.type.equals("Car")){
            vehicle.setVignette(this);
            System.out.println("Sticking vignette on "+vehicle+" for 5 seconds.");
        }
    }
}
