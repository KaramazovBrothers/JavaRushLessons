package tasks;

public class Task0403 {
    private String name = "безымянный кот";

    public void setName(String name) {
        this.name = name;

    }

    public static void main(String[] args) {
        Task0403 cat = new Task0403();
        cat.setName("Жужик");
        System.out.println(cat.name);
    }
}
