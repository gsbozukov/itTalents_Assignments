package employeePackage;
import main.Person;
public class Employee extends Person {
    private double daySalary;
    private double overtime;

    //accepting all inheritance from person and a daily salary
    public Employee (String name, int age, boolean isMale, double daySalary){
        super(name, age, isMale);
        if (daySalary>0){
            this.daySalary = daySalary;
        }
        else {
            System.out.println("Please enter a valid daily salary.");
        }
    }
    public double calculateOvertime (double hours){
        //checking if under 18
        if (this.age<18){
            this.overtime = 0;
            return 0;
        }
        //if over 18, take daily salary per hour and multiply by 1.5 for every additional hour
        else {
            double result = (this.daySalary/8)*1.5;
            this.overtime = result*hours;
            return this.overtime;
        }
    }
    public void showEmployeeInfo (){
        showPersonInfo();
        if (this.overtime != 0){
            System.out.println(this.name+" has a daily salary of "+this.daySalary+" BGN + overtime "+this.overtime
            +" BGN for a total of "+(this.daySalary+this.overtime)+" BGN for the day");
        }
        else {
            System.out.println(this.name+" has a daily salary of "+this.daySalary+" BGN");
        }
    }
}
