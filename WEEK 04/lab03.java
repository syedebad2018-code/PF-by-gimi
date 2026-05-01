import java.util.Scanner;

public class lab03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculator calc = new calculator();

        System.out.print("Enter number a: ");
        double a = sc.nextDouble();

        System.out.print("Enter number b: ");
        double b = sc.nextDouble();

        System.out.print("Enter number c: ");
        double c = sc.nextDouble();

        System.out.println("Add: " + calc.add(a, b));
        System.out.println("Max of 2: " + calc.max(a, b));
        System.out.println("Max of 3: " + calc.max(a, b, c));

        sc.close();
    }
}

class calculator {

    double add(double a, double b) {
        return a + b;
    }

    double max(double a, double b) {
        return (a > b) ? a : b;
    }

    double max(double a, double b, double c) {
        double max = a;

        if (b > max)
            max = b;
        if (c > max)
            max = c;

        return max;
    }
}
