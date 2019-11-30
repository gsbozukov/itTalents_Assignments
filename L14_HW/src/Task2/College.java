package Task2;
public class College {
    public static void main(String[] args) {
        //creating students
        Student failStudent = new Student();
        Student ivan = new Student("Ivan", "Philosophy", 34);
        Student maria = new Student("Maria", "Philosophy", 18);
        Student peter = new Student("Peter", "Arts", 17);
        Student monika = new Student("Monika", "Arts", 30);
        Student georgi = new Student("Georgi", "Philosophy", 22);
        Student dimitar = new Student("Dimitar", "Programming", 24);
        Student svilen = new Student("Svilen", "Programming", 22);
        Student daniel = new Student("Daniel", "Programming", 21);
        //setting grades
        georgi.setGrade(5.2);
        monika.setGrade(2.6);
        maria.setGrade(4.8);
        svilen.setGrade(6.2);
        daniel.setGrade(5.4);
        dimitar.setGrade(6);
        ivan.setGrade(3.3);
        //making groups
        StudentGroup philosophy = new StudentGroup("Philosophy");
        StudentGroup arts = new StudentGroup("Arts");
        StudentGroup programming = new StudentGroup("Programming");
        //giving scholarship
        double bankAccount = dimitar.receiveScholarship(3, 1235.2);
        System.out.println(dimitar.getName()+"'s bank account is (BGN): "+bankAccount);
        //upping a year
        dimitar.upYear();
        dimitar.upYear();
        dimitar.upYear();
        peter.upYear();
        peter.upYear();
        daniel.upYear();
        //adding students to groups
        philosophy.addStudent(ivan);
        philosophy.addStudent(maria);
        philosophy.addStudent(georgi);
        arts.addStudent(peter);
        arts.addStudent(monika);
        programming.addStudent(dimitar);
        programming.addStudent(svilen);
        programming.addStudent(daniel);
        programming.addStudent(failStudent);
        //printing results
        philosophy.printStudentsInGroup();
        arts.printStudentsInGroup();
        programming.printStudentsInGroup();
        failStudent.printInfo();
        //checking best students in each group
        philosophy.theBestStudent();
        programming.theBestStudent();
        arts.theBestStudent();
    }
}
