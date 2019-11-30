package scheduler;
public interface Task {
    void doWork () throws Exception;
    void addTask(String task);
    void removeTask();
    void checkNextTask() throws Exception;
}
