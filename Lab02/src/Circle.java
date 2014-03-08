import java.util.Scanner;
/**
 * 
 */

/**
 * @author A00903071
 *
 */
public class Circle {

    /**
     * @param args
     */
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner scan = new Scanner(System.in);
        
        int radius;
        System.out.println("Please enter a value for the radius");
        radius = scan.nextInt();
        double area1 = PI * radius * radius;
        double circumference1 = 2 * PI * radius;
        
        System.out.println("The area of a circle with radius " + radius + " is " + area1);
        System.out.println("The circumference of a circle with radius " + radius + " is " + circumference1);
        
        radius = radius * 2;
        double area2 = PI * radius * radius;
        double circumference2 = 2 * PI * radius;
        
        System.out.println("The area of a circle with radius " + radius + " is " + area2);
        System.out.println("The circumference of a circle with radius " + radius + " is " + circumference2);
        
        double areaChange = area2 / area1;
        double circumferenceChange = circumference2 / circumference1;
        
        System.out.println("The difference in area between the first radius and second is " + areaChange);
        System.out.println("The difference in circumference between the first and second radius is " + circumferenceChange);
        
        scan.close();
    }

}
