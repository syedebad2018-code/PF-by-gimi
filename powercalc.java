import java.util.Scanner;
public class powercalc {
    public static void main(String[] args) {
        double P;
        Scanner ki=new Scanner(System.in);
        System.out.println("Enter Voltmeter reading:");
        double V=ki.nextDouble();
        System.out.println("Enter Ammeter reading:");
        double I=ki.nextDouble();
        P=V*I;
        System.out.println("The power consumption of Electrical Appliance is:" + P);
    }
    
}
