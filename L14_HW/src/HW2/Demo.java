package HW2;
public class Demo {
    public static void main(String[] args) {
        //creating 2 tasks
        Task task1 = new Task("Task1", 25);
        Task task2 = new Task("Task2", 2);
        //creating 2 employees
        Employee ivan = new Employee("Ivancho");
        Employee maria = new Employee("Mariika");
        //setting them with 6 and 7 hours respectively
        ivan.setHoursLeft(6);
        maria.setHoursLeft(7);
        //set them at the same task for fun
        ivan.setCurrentTask(task1);
        maria.setCurrentTask(task1);
        //work it baby
        maria.work();
        //when work is done for today, there is always tomorrow
        maria.setHoursLeft(7);
        maria.work();
        //let ivan work as well
        ivan.work();
        ivan.setHoursLeft(6);
        ivan.work();
        maria.setHoursLeft(2);
        //here we're supposed to see that task 1 is done
        maria.work();
        //so we assign task 2 and we should have left over hours for maria
        ivan.setCurrentTask(task2);
        ivan.work();
        maria.setCurrentTask(task2);
        maria.work();
    }
}
