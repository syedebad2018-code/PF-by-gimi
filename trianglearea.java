import java.util.Scanner;
public class trianglearea {
    public static void main(String[] args) {
        Scanner ki=new Scanner(System.in);
        double number,s,A;
        do {
            
            System.out.println("Enter length of triangle side a:");
            double a=ki.nextDouble();
            System.out.println("Enter length of triangle side b:");
            double b=ki.nextDouble();
            System.out.println("Enter length of triangle side c:");
            double c=ki.nextDouble();
            if (a>0 && a>0 && a>0) {
                s=(a+b+c)/2;
                A=Math.sqrt(s*(s-a)*(s-b)*(s-c));
                System.out.println("The area of a triangle is :"+A);
                number=1;
            } else {
                System.out.println("Lengths cannot be negative.");
                number=-1;
            }
        } while (number<0);
    }
    
}

