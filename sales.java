import java.util.Scanner;
public class sales {
    public static void main(String[] args) {
        Scanner ki=new Scanner(System.in);
        double number,dsp,discount;
        do {
            System.out.println("Enter orignal selling price:");
            Double osp=ki.nextDouble();
            if (osp>0) {
                System.out.println("Enter Discount percentage:");
                Double dp=ki.nextDouble();
                discount=dp*osp/100;
                dsp=osp-discount;
                System.out.println("The orignal selling price is:" + osp);
                System.out.println("The discounted selling price is:" + dsp);
                number=1;
            } else {
                System.out.println("The orignal selling price cannot be negative.");
                number=-1;
            }
        } while (number<0);
    }
    
}
