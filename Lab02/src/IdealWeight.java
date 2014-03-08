import java.util.Scanner;
/**
 * 
 */

/**
 * @author A00903071
 *
 */
public class IdealWeight {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int heightFeet;
        int heightInches;
        int totalInchesRemaining;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter your height in feet, always rounding down:");
        heightFeet = scan.nextInt();
        System.out.println("Please enter the remainder of your height in Inches");
        heightInches = scan.nextInt();
        
        totalInchesRemaining = ((heightFeet - 5) * 12) + heightInches;
        
        int maleIdeal = 106 + (totalInchesRemaining * 6);
        int femaleIdeal = 100 + (totalInchesRemaining * 5); 
        
        System.out.println("The ideal weight for a female that is " + heightFeet + " feet and " + heightInches + " inches is " + femaleIdeal);
        System.out.println("The ideal weight for a male that is " + heightFeet + " feet and " + heightInches + " inches is " + maleIdeal);
        scan.close();
    }

}
