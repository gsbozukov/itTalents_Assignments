package main;
class Student extends Person{
    private double score;
    //We inherit Person and add score
    Student(String name, int age, boolean isMale, double score) {
        super(name, age, isMale);
        //accepting score
        if (score>=2 && score<=6){
            this.score = score;
        }
        else {
            System.out.println("Please enter a valid student score.");
        }
    }

    void showStudentInfo(){
        showPersonInfo();
        System.out.println("Grade: "+this.score);
    }
}
