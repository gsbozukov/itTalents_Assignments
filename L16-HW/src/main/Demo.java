package main;
import employeePackage.Employee;
public class Demo {
    public static void main(String[] args) {
        //creating an array of 10 people
        Person [] group = new Person[10];
        //we need 2 of each and inputting them in the array
        group[0] = new Person("Ivan Dimitrov", 22, true);
        group[1] = new Person("Petko Yordanov", 16, true);
        group[2] = new Student("Maria Vlastanova", 28, false, 6.0);
        group[3] = new Student("Stilian Avramov", 18, true, 4.8);
        group[4] = new Employee("Krasimir Rodopski", 17, true, 45.8);
        group[5] = new Employee("Jane Doe", 55, false, 108.4);
        //go through array and print appropriate info
        for (int i = 0; i < group.length; i++) {
            //for Student, employee and person
            if (group[i]!= null){
                if (group[i] instanceof Student){
                    ((Student)group[i]).showStudentInfo();
                    continue;
                }
                if (group[i] instanceof Employee){
                    ((Employee)group[i]).showEmployeeInfo();
                    continue;
                }
                group[i].showPersonInfo();
            }
        }
        //creating an employee object in order to compare if group[i] is the same class
        Employee exampleEmployee = new Employee("John Doe", 99, true, 55);
        //go through array again and print only for employees 2 overtime hours
        for (int i = 0; i < group.length; i++) {
            if (group[i]!=null && group[i] instanceof Employee){
                double result = ((Employee)group[i]).calculateOvertime(2);
                System.out.println(group[i].name+"'s overtime for 2h is an additional "+result+" BGN.");
            }
        }
    }
}


/////////////////////////////////// ANSWERING QUESTION//////////////////////
/*      Няма да се компилира защото дефолтния конструктор вече не съществува.
*       Ако искаме задължително да имаме дефолтен в Студент, трябва да извикаме super(name, age, isMale)
*       по следния начин и да му зададем дефолтни стойности, пример:
*       Student(){
            super("name", 0, false);
        }
*       По тозин начин задаваме на всички студенти име: name, age: 0 and isMale: false
*       Ако правим така, е редно да си направим Setters и Getters       */
