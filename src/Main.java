public class Main {
    public static void main(String[] args) {
        Programmer p1 = new Programmer("Иван");
        Programmer p2 = new Programmer("Вова");
        Task t1 = new Task(1, "Исправить баг", "Исправить ошибку в модуле X");
        Task t2 = new Task(2, "Реализовать функцию", "Реализовать функцию Y");
        Task t3 = new Task(3, "Добавить тест", "Добавить юнит-тест");
        System.out.println("---добавляем задачи программистам---");
        p1.addTask(t1);
        p1.addTask(t2);
        p2.addTask(t2);
        p2.addTask(t3);
        System.out.println("---удаляем задачу---");
        p1.removeTask(t1);
        System.out.println("----есть ли у программиста задача---");
        System.out.println(p1.hasTask());
        System.out.println("----есть ли у программиста задача с заданным номером---");
        System.out.println(p1.hasTaskWithNumber(2));
        System.out.println("---список всех задач программиста---");
        System.out.println(p1.getAllTasks());
        System.out.println(p2.getAllTasks());
    }

}