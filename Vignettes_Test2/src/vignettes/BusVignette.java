package vignettes;

public class BusVignette extends Vignette{
    public BusVignette() {
        super();
        super.price = super.price*9;
        super.color = "Red";
    }

    @Override
    public void stickOn(Vehicle vehicle) {
        if (vehicle.getVignette() == null && vehicle.type.equals("Bus")){
            vehicle.setVignette(this);
            System.out.println("Sticking vignette on "+vehicle+" for 20 seconds.");
        }
    }
}
