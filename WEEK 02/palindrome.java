import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner ki = new Scanner(System.in);
        int i, j;
        boolean k = true;
        System.out.println("Enter 1st String");
        String s1 = ki.nextLine();
        int l = s1.length();
        for (i = 0, j = l - 1; i < j; i++, j--) {
            if (s1.charAt(i) != s1.charAt(j)) {
                System.out.println("Word is not palindrome.");
                k = false;
                break;
            }
        }
        if (k) {
            System.out.println("Word is palindrome");
        }
        ki.close();
    }
}
