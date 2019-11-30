package Task1;
public class Demo {
    public static void main(String[] args) {
        Computer PC1 = new Computer();  //will allocate a memory to use
        PC1.setNamePC("PC1");
        PC1.setYear(2018);
        PC1.setPrice(1399.99);
        PC1.setNotebook(false);
        PC1.setHardDiskMemory(1000);
        PC1.setFreeMemory(16000);
        PC1.setOperationSystem("Apple");
        PC1.useMemory(100);

        Computer PC2 = new Computer();  //will change the OS
        PC2.setNamePC("PC2");
        PC2.setYear(2017);
        PC2.setPrice(1099.99);
        PC2.setNotebook(true);
        PC2.setHardDiskMemory(400);
        PC2.setFreeMemory(8000);
        PC2.setOperationSystem("Linux");
        PC2.changeOS("Atari");

        //printing results
        PC1.showInfo();
        PC2.showInfo();
    }
}
