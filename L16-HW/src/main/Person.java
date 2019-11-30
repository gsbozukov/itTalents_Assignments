package main;
public class Person {
    protected String name;
    protected int age;
    private boolean isMale;

    protected Person(String name, int age, boolean isMale){
        //accepting a given name
        if (!name.isEmpty() && name.matches("^[a-z A-z]*$")){
            this.name = name;
        }
        else {
            System.out.println("Invalid name.");
        }
        //accepting a valid age
        if (age>=0){
            this.age = age;
        }
        else {
            System.out.println("Enter a valid age.");
        }
        //accepting gender, can't go wrong here
        this.isMale = isMale;
    }

    protected void showPersonInfo (){
        System.out.println("------Name: "+this.name+"-------");
        System.out.println("Age: "+this.age+" years old");
        System.out.println(this.isMale?"Gender: M":"Gender: F");
    }
}
