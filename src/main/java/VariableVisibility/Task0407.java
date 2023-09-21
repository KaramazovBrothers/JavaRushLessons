package VariableVisibility;

public class Task0407 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.count++;

        Cat cat2 = new Cat();
        cat2.count++;

        Cat cat3 = new Cat();
        cat3.count ++;

        System.out.println("The cat count is " + Cat.count);
    }

    public static class Cat {
        public static int count = 0;
    }
}
