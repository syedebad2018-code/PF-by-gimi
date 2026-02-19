import java.util.Scanner;

public class lab04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        double sum = 0, average;

        System.out.print("Enter number of subjects: ");
        n = sc.nextInt();

        int[] marks = new int[n];

        System.out.println("Enter student marks:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
            sum = sum + marks[i];
        }
        average = sum / n;
        System.out.println("Average Score = " + average);

        sc.close();
    }
}
