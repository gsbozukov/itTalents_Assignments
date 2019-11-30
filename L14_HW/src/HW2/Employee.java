package HW2;
public class Employee {
    private String name;
    private Task currentTask;
    private int hoursLeft;
    //CONSTRUCTOR
    Employee(String name){
        if (!name.isEmpty() && name.matches("^[a-z A-Z]*$")){
            this.name = name;
        }
        else {
            System.out.println("You have entered an invalid employee name.");
        }
    }
    //SETTERS
    public void setName(String name) {
        if (!name.isEmpty() && name.matches("^[a-z A-Z]*$")){
            this.name = name;
        }
        else {
            System.out.println("You have entered an invalid employee name.");
        }
    }

    public void setCurrentTask(Task currentTask) {
        if(currentTask.getName()!=null && !currentTask.getName().isEmpty()
                && currentTask.getWorkingHours()>0){
            this.currentTask = currentTask;
        }
        else {
            this.currentTask = currentTask;
            System.out.println("The task you're trying to assign to "+this.name+" " +
                    "has no name or is already done!");
        }
    }

    public void setHoursLeft(int hoursLeft) {
        if (hoursLeft>0 && hoursLeft<16){
            this.hoursLeft = hoursLeft;
        }
        else {
            System.out.println("Please set a normal working day for "+this.name);
        }
    }
    //GETTERS

    public String getName() {
        return name;
    }

    public Task getCurrentTask() {
        return currentTask;
    }

    public int getHoursLeft() {
        return hoursLeft;
    }

    /////////////METHODS////////////////
    void work (){
        //the employee has a normal task
        if (this.currentTask.getName()!=null && this.hoursLeft > 0 && this.currentTask.getWorkingHours()>0){
            //case 1, hours left >= working hours
            if (this.hoursLeft>=this.currentTask.getWorkingHours()){
                this.hoursLeft = this.hoursLeft-this.currentTask.getWorkingHours();
                this.currentTask.setWorkingHours(0);
            }
            //case 2, hours left < working hours
            else {
                this.currentTask.setWorkingHours(this.currentTask.getWorkingHours()-this.hoursLeft);
                this.hoursLeft = 0;
            }
        }
        //the employee has no work today or has no task
        else {
            System.out.println(this.hoursLeft<=0? this.name+" is done for today." : this.name+"'s task is " +
                    "already done or DNE");
            return;
        }
        showReport();
    }
    void showReport (){
        //employee name
        System.out.println("=======REPORT FOR "+this.name+"=======");
        //task name
        System.out.println(this.name+" is working on "+this.currentTask.getName());
        //hours left for employee
        System.out.println(this.name+" has "+this.hoursLeft+"h left on the clock for today.");
        //hours left to task
        System.out.println(this.name+" has "+this.currentTask.getWorkingHours()+"h left on his/her task.");
    }
}
