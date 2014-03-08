import java.util.Scanner;
/**
 * 
 */

/**
 * @author A00903071
 *
 */
public class BaseConvert {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int b;
        int numberToConvert;
        System.out.println("Please enter a number");
        numberToConvert = scan.nextInt();
        System.out.println("Please enter a base");
        b = scan.nextInt();
        int maxNumber;
        maxNumber = (b*b*b*b) - 1;
        System.out.println(maxNumber);

        int place0;
        int place1;
        int place2;
        int place3;
        
        place0 = numberToConvert % b;
        numberToConvert = numberToConvert / b;
        place1 = numberToConvert % b;
        numberToConvert = numberToConvert / b;
        place2 = numberToConvert % b;
        numberToConvert = numberToConvert / b;
        place3 = numberToConvert % b;
        numberToConvert = numberToConvert / b;
        
        System.out.println(place0);
        System.out.println(place1);
        System.out.println(place2);
        System.out.println(place3);
        System.out.println(numberToConvert);
        
        int calc = 2 % 2;
        System.out.println(calc);
        scan.close();
        
    }

}
