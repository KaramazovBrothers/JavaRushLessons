package If_Else;

public class Task0409 {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
        checkInterval(10);
        checkInterval2(99);
        checkInterval2(100);
        checkInterval2(50);
    }

    public static void checkInterval(int a) {
        if (a > 50 && a < 100) {
            System.out.println("Число " + a + " содержится в интервале.");
        } else {
            System.out.println("Число " + a + " не содержится в интервале.");
        }
    }

    public static void checkInterval2(int a) {
        if (a < 100) {
            if (a > 50) {
                System.out.println("Число " + a + " содержится в интервале.");
            } else {
                System.out.println("Число " + a + " не содержится в интервале.");
            }
        } else {
            System.out.println("Число " + a + " не содержится в интервале.");
        }
    }
}

