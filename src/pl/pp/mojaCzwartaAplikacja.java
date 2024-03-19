package pl.pp;

import java.util.Scanner;

public class mojaCzwartaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //program 1

//        while (true) {
//            System.out.print("Enter lower integer limits: ");
//            int num1 = scanner.nextInt();
//            System.out.print("Enter upper integer limits: ");
//            int num2 = scanner.nextInt();
//            if (num1 >= num2) {
//                break;
//            }
//            System.out.println();
//            int suma = 0;
//            for (int i = num1; i <= num2; i++) {
//                suma += i * i;
//            }
//            System.out.println("The sums of the squares from " + num1 + " to " + num2 + " = " + suma);
//        }

        //program 2
        int operation;
        while (true) {
            System.out.println("Choose a mathematical operation: ");
            System.out.println("1. a + b");
            System.out.println("2. a - b");
            System.out.println("3. a ∙ b");
            System.out.println("4. a ÷ b");
            operation = scanner.nextInt();
            if (operation<=4 && operation>=1){break;}
        }
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        switch (operation) {
            case 1:
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case 2:
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case 3:
                System.out.println(a + " ∙ " + b + " = " + (a * b));
                break;
            case 4:
                double c = (double) a / b;
                System.out.println(a + " ÷ " + b + " = " + c);
                break;
        }
        scanner.close();
    }
}