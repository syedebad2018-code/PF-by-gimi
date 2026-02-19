import java.util.Scanner;

public class intadd {
    public static void main(String[] args) {
        Scanner ki = new Scanner(System.in);
        int sum;
        sum = 0;
        boolean k = true;
        while (k) {
            System.out.println("Enter number you wanna add");
            System.out.println("0 if you wanna terminate");
            int n = ki.nextInt();
            if (n != 0) {
                sum = sum + n;
            } else {
                break;
            }
        }
        System.out.println("The sum is: " + sum);
        ki.close();
    }
}
