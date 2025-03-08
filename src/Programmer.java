import java.util.ArrayList;
import java.util.List;

public class Programmer {
    private String name;
    private List<Task> taskList;

    public Programmer(String name) {
        this.name = name;
        this.taskList = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void addTask(Task task) {
        taskList.add(task);
    }

    public void removeTask(Task task) {
        taskList.remove(task);
    }

    public boolean hasTask(Task task) {
        return taskList.contains(task);
    }

    public boolean hasTask() {
        return !taskList.isEmpty();
    }

    public boolean hasTaskWithNumber(int number) {
        for (Task task : taskList) {
            if (task.getNumber() == number) {
                return true;
            }
        }
        return false;
    }

    public List<Task> getAllTasks() {
        return new ArrayList<>(taskList);


    }


    @Override
    public String toString() {
        return String.format("Программист: %s , Задача: %s", name, taskList);
    }


}



