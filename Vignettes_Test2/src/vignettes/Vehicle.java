package vignettes;

import java.util.Objects;
import java.util.Random;

public abstract class Vehicle {
    private static int index = 1;
    String type;
    private String model;
    private int year;
    private Vignette vignette;

    public Vehicle() {
        this.model = "Trabant"+index++;
        Random r = new Random();
        this.year = r.nextInt(30)+1990;
        this.vignette = null;
    }

    public String getType() {
        return type;
    }

    public Vignette getVignette() {
        return vignette;
    }

    public void setVignette(Vignette vignette) {
        this.vignette = vignette;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return model.equals(vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model);
    }

}
