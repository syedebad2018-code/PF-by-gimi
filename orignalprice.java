import java.util.Scanner;
public class orignalprice {
    public static void main(String[] args) {
        Scanner ki=new Scanner(System.in);
        double number,osp;
        do {
            System.out.println("Enter discounted selling price:");
            Double dsp=ki.nextDouble();
            if (dsp>0) {
                System.out.println("Enter Discount percentage:");
                Double dp=ki.nextDouble();
                osp=dsp/(1-dp/100);
                System.out.println("The orignal selling price is:" + osp);
                number=1;
            } else {
                System.out.println("The discounted selling price cannot be negative.");
                number=-1;
            }
        } while (number<0);
    }
    
}
