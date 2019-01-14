
// **************** Vending Machine calculation code area ******************

package vendingmachine;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Mark Ullberg
 */
public class VendingMachine {

    public static void main(String[] args) {
    
    int price; // To hold the customer input variable price of the item purchased
    int dollar = 100; // The amount input into the vending machine
    int quarters = 25; // Initial constant
    int dimes = 10;
    int nickels = 5;
    int remainder;
                    
    Scanner keyboard = new Scanner(System.in);  // create scanner object to read input
       
    System.out.print("Enter the price (in cents) of your selected item \n" + "(from 25 cents to a dollar (100), in 5-cent increments): ");  
    // Prompt the user to enter the orignal amount of principal 
    price = keyboard.nextInt();  // Input price amount and store it in the price variable
    
    int change = dollar - price;
    
    int quartersRemainder = change / quarters; // calculation to determine number of quarters in remainder
    remainder = change % quarters;
       
    int dimesRemainder = remainder / dimes; // calculation to determine number of dimes in the new remainder
    remainder = remainder % dimes;
    
    int nickelsRemainder =  remainder / nickels; // calculation to determine number of nickels in the new remainder
        
    System.out.println("You bought an item for " + price + " cents and gave me a dollar,");
    System.out.println("so your change is " + change + " cents;"); 
    System.out.println(quartersRemainder + " quarter(s)");
    System.out.println(dimesRemainder + " dime(s), and");
    System.out.println(nickelsRemainder + " nickel(s).");
    // Results output to customer 
    }
    
}
