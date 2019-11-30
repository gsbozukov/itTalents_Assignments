package task1;
public class Task {
    private String name;
    private int workingHours;

    Task(String name, int workingHours){
        //setting correct name - can't go wrong with that really, letters and digits
        //should be accepted
        if (!name.isEmpty()){
            this.name = name;
        }
        else {
            System.out.println("You have entered an invalid task name.");
        }
        if (workingHours>0){
            this.workingHours = workingHours;
        }
        else {
            System.out.println("You have entered invalid working hours for "+this.name);
        }
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }
        else {
            System.out.println("You have entered an invalid task name.");
        }
    }

    public void setWorkingHours(int workingHours) {
        if (workingHours>=0){
            this.workingHours = workingHours;
        }
        else {
            System.out.println("You have entered invalid working hours for "+this.name);
        }
    }

    public String getName() {
        return name;
    }

    public int getWorkingHours() {
        return workingHours;
    }
}
