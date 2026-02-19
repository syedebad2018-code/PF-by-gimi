import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner ki = new Scanner(System.in);
        int mul, ans;
        System.out.print("Enter a  integer of which you want table of: ");
        int num = ki.nextInt();
        mul = 1;
        while (mul <= 10) {
            ans = num * mul;
            System.out.println("\t" + num + " * " + mul + " = " + ans);
            ++mul;
            ki.close();
        }
    }
}
