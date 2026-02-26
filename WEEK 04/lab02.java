import java.util.Scanner;

public class lab02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer for a table.");
        int a = sc.nextInt();
        multiple(a);
        sc.close();
    }

    static void multiple(int a) {
        int mult = 1;
        int ans;
        while (mult <= 10) {
            ans = a * mult;
            System.out.println("\t" + a + " * " + mult + " = " + ans);
            ++mult;
        }
    }
}
