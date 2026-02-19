import java.util.Scanner;

public class lab07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] value = { 10, 20, 30, 40, 50 };
        System.out.println("Enter a number you want find in a array");
        int num = sc.nextInt();
        for (int i = 0; i < value.length; i++) {
            if (value[i] == num) {
                System.out.println("The index of a number \'" + num + "\' is " + i);
                break;
            }
        }
        sc.close();
    }
}
