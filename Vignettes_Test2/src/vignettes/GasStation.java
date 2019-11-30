package vignettes;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class GasStation {
    private static int numberOfVignettes = 10000;
    private double revenue;
    private TreeSet <Vignette> vignettes;

    public GasStation() {
        vignettes = new TreeSet<>();
        generateVignettes();
    }

    private void generateVignettes (){
        this.vignettes = new TreeSet<>();
        for (int i = 0; i < numberOfVignettes; i++) {
            Random r = new Random();
            switch (r.nextInt(3)){
                case 0: vignettes.add(new CarVignette());
                break;
                case 1: vignettes.add(new TruckVignette());
                break;
                default: vignettes.add(new BusVignette());
                break;
            }
        }
        System.out.println("FFFFFFFFFFFFFFFFFF" + this.vignettes.size());
    }
    public Vignette sellVignette (){
        Random r = new Random();
        int iteration = r.nextInt(this.vignettes.size()-1);
        Iterator <Vignette> it = this.vignettes.iterator();
        while (iteration>0) {
            it.next();
            iteration--;
        }
        //remove from list
        Vignette chosenOne = it.next();
        this.revenue = this.revenue + chosenOne.getPrice();
        System.out.println(chosenOne);
        it.remove();
        return chosenOne;
    }
    /////*9 for me***********************
    public void vignettesLeft (){
        System.out.println(this.vignettes.size());
    }

    public void printVignettes() {
        System.out.println(this.vignettes);
    }
}
