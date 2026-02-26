import java.util.Scanner;

public class lab03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculator calc = new calculator();
        System.out.print("Enter integer a: ");
        Double a = sc.nextDouble();
        System.out.print("Enter integer b: ");
        Double b = sc.nextDouble();
        System.out.print("Enter integer c: ");
        Double c = sc.nextDouble();
        System.out.println("Int Add: " + calc.add(a, b));
        System.out.println("Double Add: " + calc.adddouble(a, b));

        System.out.println("Max of 2: " + calc.max(a, b));
        System.out.println("Max of 3: " + calc.max(a, b, c));
        sc.close();
    }
}

class calculator {
    Double add(Double a, Double b) {
        return a + b;
    }

    double adddouble(double a, double b) {
        return a + b;
    }

    Double max(Double a, Double b) {
        return (a > b) ? a : b;
    }

    Double max(Double a, Double b, Double c) {
        Double max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        return max;
    }
}
