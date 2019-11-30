package task1;
class AllWork {
    private Task [] tasks;
    private int freePlacesForTasks;
    int currentUnassignedTask;
    int sizeOfTasks  = 10;

    AllWork (){
        this.tasks = new Task [this.sizeOfTasks];
        this.freePlacesForTasks = this.sizeOfTasks;
        this.currentUnassignedTask = 0;
    }
    //////////////METHODS//////////////
    //adding task to the array
    void addTask(Task task){
        //what if I want to add more than 10 tasks
        if (this.freePlacesForTasks <= 0){
            System.out.println("You cannot add more tasks!");
        }
        else {
            //tasks[i] = task, where i is the next available spot in the array
            this.tasks[this.tasks.length - this.freePlacesForTasks] = task;
            //decrement free places
            this.freePlacesForTasks--;
        }
    }
    Task getNextTask (){
        return this.tasks[currentUnassignedTask++];
    }
    boolean isAllWorkDone (){
        int hoursLeft = 0;
        for (int i = 0; i < this.tasks.length; i++) {
            //if the first index is null, therefore the array of tasks is empty
            if (this.tasks[0] == null){
                System.out.println("There is no assigned work! Work has not even begun...");
                return false;
            }
            //we enter here only if there is a valid reference
            if (this.tasks[i] != null){
                //increment hours left
                hoursLeft = hoursLeft+this.tasks[i].getWorkingHours();
            }
        }
        return (hoursLeft == 0);
    }
}
