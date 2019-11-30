package Task2;
public class StudentGroup {
    private String groupSubject;
    private Student[]students;
    private int freePlaces;

    //default constructor
    StudentGroup(){
        this.students = new Student[5];
        this.freePlaces = 5;
    }
    //second constructor
    StudentGroup (String groupSubject){
        this();
        //check for only alphabetical chars
        if (groupSubject.matches("^[ a-zA-Z]+$")){
            this.groupSubject = groupSubject;
        }
        else {
            System.out.println("Please enter a valid group subject.");
        }
    }
    ///////// METHODS//////////

    void addStudent (Student s){
        //adding a student to the array
        //checking for subject and checking for free spots
        if (!s.subject.isEmpty() && s.subject.equals(this.groupSubject) && this.freePlaces>0){
            this.students[(this.students.length-this.freePlaces)] = s;
            this.freePlaces--;
        }
        else {
            System.out.println(s.getName()+"'s subject do not coincide with "+this.groupSubject+" group" +
                    " or there are not enough places left.");
        }
    }

    void emptyGroup (){
        //resets places and creates a new array with a new counter for the places
        this.students = new Student[5];
        this.freePlaces = 5;
    }

    void theBestStudent(){
        double maxGrade = 0;
        int maxI = 0;
        for (int i = 0; i < this.students.length; i++) {
            //verify only when there is a student and not an empty seat
            if (students[i]!=null){
                if (students[i].getGrade()>maxGrade){
                    maxGrade = students[i].getGrade();
                    maxI = i;
                }
            }
        }
        if (maxGrade ==0){
            System.out.println("There is no one in the group "+this.groupSubject);
        }
        else {
            System.out.println("The best student in "+this.groupSubject+" is "+students[maxI].getName());
        }
    }

    void printStudentsInGroup (){
        for (int i = 0; i < this.students.length; i++) {
            if (students[i]!=null) {
                students[i].printInfo();
            }
        }
    }
}
