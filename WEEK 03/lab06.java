import java.util.Scanner;

public class lab06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("How many numbers you want to add in array");
        n = sc.nextInt();
        int[] value = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter a integer");
            value[i] = sc.nextInt();
        }
        int even = 0;
        int odd = 0;
        for (int j = 0; j < value.length; j++) {
            if (value[j] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("There are " + even + " even integers");
        System.out.println("There are " + odd + " odd integers");
        sc.close();
    }
}
