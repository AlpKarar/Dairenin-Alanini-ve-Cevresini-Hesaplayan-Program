import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        
        int r, alpha;
        double pi = 3.14, ratio, cir, area, slice_area;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter radius: ");
        r = input.nextInt();
        
        System.out.print("Enter degree: ");
        alpha = input.nextInt();
        
        cir = 2*pi*r;
        area = pi*r*r;
        
        ratio = alpha / 360.0;
        slice_area = area*ratio;
        
        System.out.printf("Circumference: %.2f \nArea: %.2f \nArea of Slice(alpha = %d): %.2f", cir, area, alpha, slice_area);
    }
}
