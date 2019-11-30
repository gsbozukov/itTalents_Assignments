package Task1;
public class Computer {
    String namePC;
    private static int counter = 1;
    private int year;
    private double price;
    private boolean isNotebook;
    private double hardDiskMemory;
    private double freeMemory;
    private String operationSystem;

    //Default constructor: making the default PC not a laptop, with winXP and name PCx
    //where x is the next number
    Computer (){
        this.isNotebook = false;
        this.operationSystem = "Win XP";
        this.namePC = "PC"+counter;
        counter++;
    }
    //Second constructor
    Computer (int year, double price, double hardDiskMemory, double freeMemory){
        this();
        //setting year
        if (year>1822 && year<=2019){
            this.year = year;
        }
        else {
            System.out.println("Enter a valid year for "+this.namePC);
        }
        //setting price
        if (price>=1){
            this.price = price;
        }
        else {
            System.out.println("Set a realistic price for "+this.namePC);
        }
        //setting hard disk memory
        if (hardDiskMemory>=1 && hardDiskMemory<=100000){
            this.hardDiskMemory = hardDiskMemory;
        }
        else {
            System.out.println("Enter a valid hard disk size for "+this.namePC);
        }
        //setting free memory
        if (freeMemory>=2 && freeMemory<=128000){
            this.freeMemory = freeMemory;
        }
        else {
            System.out.println("Enter a valid RAM for "+this.namePC);
        }
    }
    //third constructor
    Computer (int year, double price, double hardDiskMemory, double freeMemory, boolean isNotebook, String operationSystem){
        this(year, price, hardDiskMemory, freeMemory);
        //entering OS
        if (operationSystem!=null && !operationSystem.isEmpty()){
            this.operationSystem = operationSystem;
        }
        else {
            System.out.println("Please enter a valid OS for "+this.namePC);
        }
        //entering notebook
        this.isNotebook = isNotebook;
    }

    //COMPARE PRICES
    int comparePrice (Computer other){
        //case where price is not set or user is comparing
        if (this.price <= 0 || other.price <= 0 || this == other){
            return this==other? 3 : 2;
        }
        else {
            //if our price is higher than the other
            if (this.price > other.price) {
                return -1;
            }
            else {
                //if our price is lower than the other
                if (this.price < other.price) {
                    return 1;
                }
                //else we're equal
                else{
                    return 0;
                }
            }
        }
    }


    // CHANGE OS METHOD
    void changeOS(String operationSystem){
        //Here in order to be perfect, I need to list all the existing OS's
        if (operationSystem!=null && !operationSystem.isEmpty()){
            this.operationSystem = operationSystem;
        }
        else {
            System.out.println("Please enter a valid OS!");
        }
    }
    // USE MEMORY METHOD
    void useMemory (double memory){
        if (memory <= this.freeMemory){
            this.freeMemory -= memory;
        }
        else {
            System.out.println("Not enough free memory!");
        }
    }

    public void setYear(int year) {
        if (year>1822 && year<2019){
            this.year = year;
        }
        else {
            System.out.println("Enter a valid year!");
        }

    }

    public void setPrice(double price) {
        if (price>=1){
            this.price = price;
        }
        else {
            System.out.println("Be realistic, nothing is free!");
        }
    }

    public void setNotebook(boolean isNotebook) {
        this.isNotebook = isNotebook;
    }

    public void setHardDiskMemory(double hardDiskMemory) {
        if (hardDiskMemory>=1 && hardDiskMemory<=100000){
            this.hardDiskMemory = hardDiskMemory;
        }
        else {
            System.out.println("Enter a valid hard disk size!");
        }
    }

    public void setFreeMemory(double freeMemory) {
        if (freeMemory>=2 && freeMemory<=128000){
            this.freeMemory = freeMemory;
        }
        else {
            System.out.println("Enter a valid RAM!");
        }
    }

    //FAST PRINT
    void showInfo(){
        System.out.println("Characteristics for: "+this.namePC);
        System.out.println("Made in "+this.year);
        System.out.print("It is a ");
        System.out.println(isNotebook? "laptop." : "desktop.");
        System.out.println("Price: "+this.price+" BGN");
        System.out.println("Hard Disk space: "+this.hardDiskMemory+ " Gb");
        System.out.println("RAM space: "+this.freeMemory+ " Mb");
        System.out.println("The OS is: "+this.operationSystem);
        System.out.println();
        System.out.println();
    }
}
