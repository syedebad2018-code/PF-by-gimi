import java.util.Scanner;
public class Percentage {
    public static void main(String[] args) {
        Scanner ki = new Scanner(System.in);
        double percentage, number;
        System.out.println("Enter maximum marks:");
        double mm=ki.nextDouble();
        do {
            System.out.println("Enter obtained marks:");
            double om=ki.nextDouble();
            if (om<=mm) {
                percentage=om/mm*100;
                System.out.println("Your percentage is:" + percentage);
                number=1;
            } else {
                System.out.println("Obtained marks cannot be greater than maximum marks.");
                number=-1;
            }
        } while (number<0);
    }
}
