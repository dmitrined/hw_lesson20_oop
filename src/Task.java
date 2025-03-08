import java.util.Objects;

public class Task {
    private int number;
    private String title;
    private String description;

    public Task(int number, String title, String description) {
        this.number = number;
        this.title = title;
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }


    @Override
    public String toString() {
        return String.format("Nr:%d; Заголовок- %s; Описание- %s", number, title, description);
    }
}