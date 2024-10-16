package home.work.ui;

public class Console {
    public static void printNumber(String name, double temp) {
        System.out.printf("%s: %.2f", name, temp);
        System.out.println();
    }

    public static void printText(String name, String text) {
        System.out.printf("%s: %s", name, text);
    }
}
