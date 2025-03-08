public class Main {
    public static void main(String[] args) {
        Programmer p1 = new Programmer("Иван");
        Programmer p2 = new Programmer("Вова");
        Task t1 = new Task(1, "Исправить баг", "Исправить ошибку в модуле X");
        Task t2 = new Task(2, "Реализовать функцию", "Реализовать функцию Y");
        Task t3 = new Task(3, "Добавить тест", "Добавить юнит-тест");

    }
}