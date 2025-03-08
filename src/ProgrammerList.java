import java.util.ArrayList;
import java.util.List;

public class ProgrammerList {
    private List<Programmer> programmerList;

    public ProgrammerList() {
        this.programmerList = new ArrayList<>();
    }

    public void addProgrammer(Programmer programmer) {
        programmerList.add(programmer);
    }

    public int getTotalProgrammers() {
        return programmerList.size();
    }

    public List<Task> getAllTasksFromAllProgrammers() {
        List<Task> allTasks = new ArrayList<>();
        for (Programmer programmer : programmerList) {
            allTasks.addAll(programmer.getTaskList());
        }
        return allTasks;
    }

    public static List<Programmer> findProgrammersWithTask(List<Programmer> programmers, Task task) {
        List<Programmer> programmersWithTask = new ArrayList<>();
        for (Programmer programmer : programmers) {
            if (programmer.hasTask(task)) {
                programmersWithTask.add(programmer);
            }
        }
        return programmersWithTask;
    }

    public List<Programmer> getProgrammerList() {
        return programmerList;
    }

    @Override
    public String toString() {
        return String.format("Список программистов: %s", programmerList);
    }
}
