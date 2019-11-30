package task1;
class Employee {
    private String name;
    private Task currentTask;
    private int hoursLeft;
    private AllWork allWork;
    static int workDay = 1;
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
    void setName(String name) {
        if (!name.isEmpty() && name.matches("^[a-z A-Z]*$")){
            this.name = name;
        }
        else {
            System.out.println("You have entered an invalid employee name.");
        }
    }

    private void setCurrentTask() {
        //If tasks are done, don't assign any
        if (this.allWork.currentUnassignedTask >= this.allWork.sizeOfTasks){
            System.out.println("No more tasks to give to "+this.name);
        }
        //else, give the next task
        else {
            //if it is the end of the day don't start working, else continue working
            if (this.hoursLeft>0){
                this.currentTask = this.allWork.getNextTask();
                //this.work();
            }
            else {
                //just assign task and wait for tomorrow
                this.currentTask = this.allWork.getNextTask();
                this.showReport();
            }

        }
    }

    void setHoursLeft(int hoursLeft) {
        if (hoursLeft>0 && hoursLeft<9){
            this.hoursLeft = hoursLeft;
        }
        else {
            System.out.println("Please set a normal working day for "+this.name);
        }
    }
    void setAllWork (final AllWork allWork){
        this.allWork = allWork;
    }
    //GETTERS
    AllWork getAllWork() {
        return this.allWork;
    }

    String getName() {
        return this.name;
    }

    Task getCurrentTask() {
        return this.currentTask;
    }

    int getHoursLeft() {
        return this.hoursLeft;
    }

    /////////////METHODS////////////////
    void startWorkingDay (){
        //set working hours to 8
        this.setHoursLeft(8);
        System.out.println(this.name+" starts its "+workDay+" day of work.");
        //if it is day 1, start by taking tasks, otherwise continue working
        if (workDay == 1){
            this.setCurrentTask();
        }
//        else {
//            this.work();
//        }
    }
    void work (){
        if (this.currentTask.getWorkingHours()<=0 && this.allWork.currentUnassignedTask>=this.allWork.sizeOfTasks){
            //end
            return;
        }
        //if hoursLeft>taskTime
        if (this.hoursLeft >= this.currentTask.getWorkingHours()){
            //discount my hours
            this.hoursLeft = this.hoursLeft-this.currentTask.getWorkingHours();
            //set task to 0
            this.currentTask.setWorkingHours(0);
            //show report and
            //go get a new task
            this.showReport();
            this.setCurrentTask();
            this.work();
        }
        //else taskTime>hours left, so I'll have leftover for tomorrow
        else {
            //decrement task time
            this.currentTask.setWorkingHours(this.currentTask.getWorkingHours()-this.hoursLeft);
            //decrement hours left
            this.hoursLeft = 0;
            //end the day and show report
            this.showReport();
        }

    }
    private void showReport (){
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
