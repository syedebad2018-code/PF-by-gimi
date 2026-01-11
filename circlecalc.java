import java.util.Scanner;
public class circlecalc {
    public static void main(String[] args) {
        double A,C,number;
        Scanner ki=new Scanner(System.in);
        do {
            System.out.println("Enter Radius of a circle:");
            double r=ki.nextDouble();
            if (r>0) {
                A=Math.PI*r*r;
                System.out.println("The area of circle is : "+ A);
                C=2*Math.PI*r;
                System.out.println("The circumference of a circle is : " + C);
                number=1;
            } else {
                System.out.println("The radius of a circle cannot be negative.");
                number=-1;
            }
        } while (number<0);
    }
    
}
