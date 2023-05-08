import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Week week = Week.valueOf(scanner.nextLine().toUpperCase());
        switch (week) {
            case MONDAY -> Week.MONDAY.method();
            case TUESDAY -> Week.TUESDAY.method();
            case WEDNESDAY -> Week.WEDNESDAY.method();
            case THURSDAY -> Week.THURSDAY.method();
            case FRIDAY -> Week.FRIDAY.method();
            case SATURDAY -> Week.SATURDAY.method();
            case SANDAY -> Week.SANDAY.method();
        }

    }
}