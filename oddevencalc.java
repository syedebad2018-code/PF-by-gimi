import java.util.Scanner;
public class oddevencalc {
    public static void main(String[] args) {
        Scanner ki=new Scanner(System.in);
        double rem;
        System.out.println("Enter a number:");
        double number=ki.nextDouble();
        rem=number%2;
        if (rem==0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }
    
}
