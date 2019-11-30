package vignettes;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;
import java.util.Random;

public abstract class Vignette implements Comparable <Vignette>{
    private static int index = 1;
    private String name;
    private LocalDate issueDate;
    String color;
    private Period validityPeriod;
    private LocalDate expiryDate;
    double price;

    public Vignette() {
        this.name = "Vignette"+index++;
        Random r = new Random();
        int y = r.nextInt(2)+2019;
        int m = r.nextInt(12)+1;
        int d = r.nextInt(25)+1;
        this.issueDate = LocalDate.of(y, m, d);
        //random period
        switch (r.nextInt(3)){
            case 0: this.validityPeriod = Period.ofMonths(1);
                this.price = 10;
                break;
            case 1: this.validityPeriod = Period.ofDays(1);
                this.price = 1;
                break;
            default: this.validityPeriod = Period.ofYears(1);
                this.price = 60;
                break;
        }
        this.expiryDate = issueDate.plus(validityPeriod);
    }

    public abstract void stickOn(Vehicle vehicle);

    public double getPrice (){
        return this.price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vignette vignette = (Vignette) o;
        return name.equals(vignette.name);
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    //comparable for treeset in Gas Station, we need to allow duplication of prices, so exlude 0
    @Override
    public int compareTo(Vignette o) {
        return this.price>o.price? 1:-1;
    }

    @Override
    public String toString() {
        return "Vignette{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
