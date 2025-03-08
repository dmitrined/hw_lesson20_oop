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

    @Override
    public String toString() {
        return String.format("Список программистов: %s", programmerList);
    }
}
