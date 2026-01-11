import java.util.Scanner;
public class trapezoidarea {
    public static void main(String[] args) {
        Scanner ki=new Scanner(System.in);
        double number,K;
        do {
            System.out.println("Enter first parallel side a:");
            double a=ki.nextDouble();
            System.out.println("Enter second parallel side b:");
            double b=ki.nextDouble();
            System.out.println("Enter height h:");
            double h=ki.nextDouble();
            if (a>0 && b>0 && h>0 ) {
                K=h*(a+b)/2;
                System.out.println("The area of trapezoid is:" + K);
                number=1;
            } else {
                System.out.println("The lengths cannot be negative.");
                number=-1;
            }
        } while (number<0);
    }
}
