
// ********* Restaurant Bill calculation code area ***********

package restaurantbill;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mark Ullberg
 */
public class RestaurantBill {

    public static void main(String[] args) {
    
    double taxRate = .10; // To hold the constant tax rate of 10%
    double billAmount; // To hold the customer input variable bill amount
    double tipPercentage;  // To hold the customer input variable tip percentage
            
            
    Scanner keyboard = new Scanner(System.in);  // create scanner object to read input
   
    System.out.print("Enter the amount of your bill: ");  // Prompt the user to enter bill amount. 
    billAmount = keyboard.nextDouble();  // Input bill amount and store it in the billAmount variable        

    System.out.print("Enter the percentage of your bill to be provided as a tip: ");  // Prompt the user to enter a tip percentage. 
    tipPercentage = keyboard.nextDouble();  // Input tip percentage from user and store it in the tipPercentage variable
    
    double taxAmount = billAmount * taxRate; // Calculate the amount of tax and store in a new variable
    double interimBill = billAmount + taxAmount; // Calculate the interim bill that includes input bill amount and calculated tax
    double tipAmount = (interimBill * tipPercentage) / 100; // Calculate the tip amound and store in a new variable
    double billTotal = interimBill + tipAmount; // Calculate the final bill to a new variabled by adding the interim bill and the tip
     
    System.out.println("Your meal cost is: " + NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(billAmount));
    System.out.println("The tax for your meal is: " + NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(taxAmount)); 
    System.out.println("The tip for your meal + tax is: " + NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(tipAmount));
    System.out.println("Your total bill is: " + NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(billTotal)); 
    // Results output to customer 
    
    // ************** End of Restaurant Bill calculation code area **************
    
    }
    
}
