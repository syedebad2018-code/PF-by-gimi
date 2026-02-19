import java.util.Scanner;

public class lab05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, largest;
        System.out.println("How many numbers you want to add?");
        n = sc.nextInt();
        int[] value = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter a integer");
            value[i] = sc.nextInt();
        }
        largest = value[0];
        for (int j = 0; j < value.length; j++) {
            if (value[j] > largest) {
                largest = value[j];
            }
        }
        System.out.println("The largest number is: " + largest);
        sc.close();
    }
}
