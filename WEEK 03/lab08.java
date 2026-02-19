import java.util.Scanner;

public class lab08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many integers you wanna add in array: ");
        int n = sc.nextInt();
        int[] value = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a integer: ");
            value[i] = sc.nextInt();
        }
        System.out.println("Before: ");
        for (int i = 0; i < n; i++) {
            System.out.print(value[i] + "\t");
        }
        System.out.println("\nAfter: ");
        for (int j = n - 1; j >= 0; j--) {
            System.out.print(value[j] + "\t");
        }
        sc.close();
    }
}
