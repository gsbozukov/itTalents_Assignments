package scheduler;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Scheduler implements Task{
    Queue <String> queue = new LinkedList<>();
    Scanner sc = new Scanner(System.in);

    //methods
    void push (String taskName){
        //when you push a task, it has to create the task and enter it in the scheduler
        //what is the name of the task you would like to push?
        System.out.println("You have created a new task "+taskName);
        //send the job to add task
        addTask(taskName);
    }
    void main () throws Exception {
        //we create tasks and start working on them
        push("Task1");
        push("Task2");
        push("Task3");
        push("Task4");
        push("Task5");
        push("Task6");
        while (true){
            doWork();
        }
    }

    @Override
    public void doWork() throws Exception {
        //I take the next task and execute it
        System.out.println("I am doing task:");
        checkNextTask();
        removeTask();
        //The next task is:
        System.out.println("The next task is:");
        checkNextTask();
    }

    @Override
    public void addTask(String taskName) {
        // we add the task
        this.queue.offer(taskName);
    }

    @Override
    public void removeTask() {
        //we remove the next task
        if (this.queue.isEmpty()){
            System.out.println("You have no more tasks left!");
            return;
        }
        this.queue.poll();
    }

    @Override
    public void checkNextTask() throws Exception {
        if (this.queue.isEmpty()){
            throw new Exception("You have no tasks left to do!");
        }
        System.out.println(this.queue.peek());
    }
}
