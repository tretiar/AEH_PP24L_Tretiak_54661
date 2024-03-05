import java.util.Scanner;

public class mojaDrugaAplikacja {
    public static void main(String[] args) {

        // program 1

        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podaj swoje imię:");
        String forename = scanner.nextLine();
        System.out.println("Proszę podaj swoje nazwisko:");
        String surname = scanner.nextLine();
        System.out.println("Witaj " + forename + " " + surname);

        //program 2

        double x = 10;
        double y = 2;
        var result = x + y;
        System.out.println("x + y = " + result);
        result = x - y;
        System.out.println("x -y = " + result);
        result = x * y;
        System.out.println("x * y = " + result);
        result = x / y;
        System.out.println("x / y = " + result);
        result = x % y;
        System.out.println("x % y = " + result);
        System.out.println("Wpisz dwie liczby rozdzielone klawiszem Enter:");
        double first = scanner.nextDouble();
        double second = scanner.nextDouble();
        System.out.println("x + y = " + (first + second));


        // program 3

        int x_1;
        x_1 = 10;
        System.out.println("x=" + x_1);
        System.out.println("2*x=" + (x_1 * 2));
        System.out.println("x**2=" + (x_1 * x_1));

        // program 4

        System.out.println("Input age in years: ");
        int age = scanner.nextInt();
        System.out.println("Your age in seconds: " + (age * 60 * 60 * 24 * 365));
        scanner.close();
    }
}