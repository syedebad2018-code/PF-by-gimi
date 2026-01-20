import java.util.Scanner;
public class multipleofseven {
    public static void main(String[] args) {
        Scanner ki = new Scanner(System.in);
        System.out.print("Enter a first(Lower) number:");
        int a = ki.nextInt();
        System.out.print("Enter a second(Higher) number:");
        int b = ki.nextInt();
        String c = ("The multiples of 7 between " + a + " and " + b + " are: ");
        System.out.println(c);
        while (a <= b) {
            if (a % 7 == 0) {
                System.out.println(a);
            }
            a += 1;
        }
        ki.close();
    }
}
