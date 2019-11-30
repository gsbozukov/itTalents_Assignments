package Task2;
public class Student {
    private String name;
    String subject = "";
    private double grade;
    private int yearInCollege;
    private int age;
    private boolean hasDegree;
    private double money;

    //default constructor
    Student (){
        this.grade = 4.0;
        this.yearInCollege = 1;
        this.hasDegree = false;
        this.money = 0;
    }
    //second constructor - uses the 4 by default settings and asks for the rest
    Student (String name, String subject, int age){
        this();
        //controlling name and subject to have only alphabetical chars
        if (name.matches("^[a-zA-Z]*$") && subject.matches("^[a-zA-Z]*$")){
            this.name = name;
            this.subject = subject;
        }
        else {
            System.out.println("Please enter a valid name or subject!");
        }
        //checking for age
        if (age>14 && age<100){
            this.age = age;
        }
        else {
            System.out.println("Please enter a valid age for "+this.name);
        }
    }
    //setters in case we want to change grade, year in college, degree and money
    public void setGrade(double grade) {
        //between 2 and 6
        if (grade>=2 && grade<=6){
            this.grade = grade;
        }
        else {
            System.out.println("Please enter a valid grade for "+this.name);
        }
    }

    public void setYearInCollege(int yearInCollege) {
        //between 1 and 3, because 4 is graduation
        if (yearInCollege>=1 && yearInCollege<4){
            this.yearInCollege = yearInCollege;
        }
        else {
            System.out.println("Please enter a valid year in college for "+this.name);
        }
    }

    public void setHasDegree(boolean hasDegree) {
        this.hasDegree = hasDegree;
    }

    public void setMoney(double money) {
        if (money>0){
            this.money = money;
        }
        else {
            System.out.println("Please enter a valid amount of money for "+this.name);
        }
    }

    public double getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    //////////////// METHODS ///////////////////////
    void upYear (){
        //when he passes a year, his age becomes ++ as well as the year
        //if he has degree, say so
        if (this.hasDegree){
            System.out.println(this.name+" is a graduate already!");
        }
        else {
            //last year of college, so we give him a diploma
            if (this.yearInCollege == 3){
                this.yearInCollege++;
                this.hasDegree = true;
                this.age++;
                System.out.println("Congratulations "+this.name+"!");
                System.out.println("You have graduated with a grade of "+this.grade);
            }
            //otherwise we only increment year
            else {
                this.yearInCollege++;
                this.age++;
            }
        }
    }
    double receiveScholarship(double min, double amount){
        //checking min and amount, as well as age
        if (min>6 || min<2){
            System.out.println("Please enter a valid grade threshold for "+this.name);
            return 0;
        }
        if (amount<0){
            System.out.println("Please insert a positive amount of money for "+this.name);
            return 0;
        }
        if (this.age >= 30){
            System.out.println("Sorry you are too old for a scholarship "+this.name);
            return 0;
        }
        //checking student qualification for scholarship
        if (this.grade>=min){
            this.money += amount;
            System.out.println("Congratulations "+this.name+", you received a scholarship!");
            return this.money;
        }
        else {
            System.out.println("Sorry "+this.name+", your grades are not high enough! You did not qualify.");
            return 0;
        }
    }

    //fast print
    void printInfo (){
        System.out.println("==========STUDENT: "+this.name+"============");
        System.out.println("Studies "+this.subject);
        System.out.println("Grade: "+this.grade);
        System.out.println(this.yearInCollege+" year in college");
        System.out.println(this.age+" years old");
        System.out.println(this.hasDegree?"has a DEGREE":"doesn't have a DEGREE");
        System.out.println("Has "+this.money+" BGN.");
        System.out.println();
    }
}
