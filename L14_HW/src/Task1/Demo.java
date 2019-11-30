package Task1;
public class Demo {
    public static void main(String[] args) {
        Computer pc1 = new Computer();
        Computer pc2 = new Computer(2015, 1220.99, 52, 100, true, "MAC");
        Computer pc3 = new Computer(2018, 1120.89, 52, 100);

        //comparing prices

        switch (pc1.comparePrice(pc2)){
            default:
                System.out.println("Prices are equal!");
                break;
            case 3:
                System.out.println("You are comparing the same PC");
                break;
            case 2:
                System.out.println("Please enter valid prices before comparing PC's.");
                break;
            case 1:
                System.out.println(pc1.namePC+" is cheaper than "+pc2.namePC);
                break;
            case -1:
                System.out.println(pc1.namePC+" is more expensive than "+pc2.namePC);
                break;
        }
        switch (pc2.comparePrice(pc3)){
            default:
                System.out.println("Prices are equal!");
                break;
            case 3:
                System.out.println("You are comparing the same PC");
                break;
            case 2:
                System.out.println("Please enter valid prices before comparing PC's.");
                break;
            case 1:
                System.out.println(pc2.namePC+" is cheaper than "+pc3.namePC);
                break;
            case -1:
                System.out.println(pc2.namePC+" is more expensive than "+pc3.namePC);
                break;
        }
        switch (pc3.comparePrice(pc3)){
            default:
                System.out.println("Prices are equal!");
                break;
            case 3:
                System.out.println("You are comparing the same PC");
                break;
            case 2:
                System.out.println("Please enter valid prices before comparing PC's.");
                break;
            case 1:
                System.out.println(pc3.namePC+" is cheaper than "+pc3.namePC);
                break;
            case -1:
                System.out.println(pc3.namePC+" is more expensive than "+pc3.namePC);
                break;
        }
    }
}
