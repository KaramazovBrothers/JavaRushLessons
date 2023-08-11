package tasks;

public class Task0401 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Возраст: " + person.age);
        person.adjustAge(20);
        System.out.println("Измененный возраст: " + person.age);
    }

    public static class Person {
        public int age = 20;

        public void adjustAge(int age) {
            System.out.println("Измененный возраст = " + this.age + " + 20");
            this.age = age +20;
        }
    }
}
