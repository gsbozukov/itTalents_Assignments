package task1;
public class Demo {
    public static void main(String[] args) {
        //creating employees
        Employee jo = new Employee("Jojo");
        Employee bo = new Employee("Bobi");
        Employee go = new Employee("Gogo");
        Employee di = new Employee("Dimi");
        //creating all work
        AllWork monday = new AllWork();
        //creating tasks and adding them to all work
        monday.addTask(new Task("Task1", 1));
        monday.addTask(new Task("Task2", 5));
        monday.addTask(new Task("Task3", 2));
        monday.addTask(new Task("Task4", 8));
        monday.addTask(new Task("Task5", 12));
        monday.addTask(new Task("Task6", 6));
        monday.addTask(new Task("Task7", 15));
        monday.addTask(new Task("Task8", 12));
        monday.addTask(new Task("Task9", 10));
        monday.addTask(new Task("Task10", 4));

        //set all work to employees
        jo.setAllWork(monday);
        bo.setAllWork(monday);
        go.setAllWork(monday);
        di.setAllWork(monday);
        //starting working week and stop only when all work is done
        while (!monday.isAllWorkDone()) {
            jo.startWorkingDay();
            bo.startWorkingDay();
            go.startWorkingDay();
            di.startWorkingDay();
            jo.work();
            bo.work();
            go.work();
            di.work();
            Employee.workDay++;
        }

    }
}
