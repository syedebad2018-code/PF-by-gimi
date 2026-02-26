import java.util.Scanner;

public class lab04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (prime(n)) {
            System.out.println("The number is prime.");
        } else {
            System.out.println("The number is not prime.");
        }
        sc.close();
    }

    static boolean prime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }
}
