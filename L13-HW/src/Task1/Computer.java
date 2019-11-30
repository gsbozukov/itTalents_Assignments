package Task1;
public class Computer {

    private String namePC = "PC";
    private int year = 2019;
    private double price = 1600;
    private boolean isNotebook = false;
    private int hardDiskMemory = 1000;
    private int freeMemory = 8000;
    private String operationSystem = "Windows";
    // CHANGE OS METHOD
    void changeOS(String operationSystem){
        //Here in order to be perfect, I need to list all the existing
        //OS - which will be tedious, so I only verify if it is alphabetic or not
        if (operationSystem!=null && operationSystem.matches("^[a-zA-Z]*$")){
            this.operationSystem = operationSystem;
        }
        else {
            System.out.println("Please enter only Alphabetic characters");
        }
    }
    // USE MEMORY METHOD
    void useMemory (int memory){
        if (memory <= this.freeMemory){
            this.freeMemory -= memory;
        }
        else {
            System.out.println("Not enough free memory!");
        }
    }
    //setting characteristics to our computer
    public void setNamePC(String namePC) {
        this.namePC = namePC;
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

    public void setHardDiskMemory(int hardDiskMemory) {
        if (hardDiskMemory>=1 && hardDiskMemory<=100000){
            this.hardDiskMemory = hardDiskMemory;
        }
        else {
            System.out.println("Enter a valid hard disk size!");
        }
    }

    public void setFreeMemory(int freeMemory) {
        if (freeMemory>=2 && freeMemory<=128000){
            this.freeMemory = freeMemory;
        }
        else {
            System.out.println("Enter a valid RAM!");
        }
    }

    public void setOperationSystem(String operationSystem) {
        if (operationSystem!=null && operationSystem.matches("^[a-zA-Z]*$")){
            this.operationSystem = operationSystem;
        }
        else {
            System.out.println("Please enter only Alphabetic characters");
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
