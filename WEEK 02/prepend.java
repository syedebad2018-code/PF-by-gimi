import java.util.Scanner;

public class prepend {
    public static void main(String[] args) {
        Scanner ki = new Scanner(System.in);
        int i, length;
        String reverse = "";
        System.out.println("Enter a string you want to append");
        String s1 = ki.nextLine();
        length = s1.length();
        for (i = length - 1; i >= 0; i--) {
            char c = s1.charAt(i);
            reverse = reverse + c;
        }
        System.out.println(reverse);

        ki.close();
    }
}
