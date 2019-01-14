
// **************** Interest Earned calculation code area ******************

package interestearned;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Mark Ullberg
 */
public class InterestEarned {

    public static void main(String[] args) {
        
    double principalAmt; // To hold the customer input variable principal amount
    double interestRate; // To hold the customer input variable interest rate amount
    int timesCompounded;  // To hold the customer input variable for number of times compounding occurs
               
    Scanner keyboard = new Scanner(System.in);  // create scanner object to read input
       
    System.out.print("Enter your principal amount: ");  // Prompt the user to enter the orignal amount of principal 
    principalAmt = keyboard.nextDouble();  // Input principal amount and store it in the principalAmt variable        

    System.out.print("Enter your interest rate: ");  // Prompt the user to enter their interest rate 
    interestRate = keyboard.nextDouble();  // Input the interest rate from user and store it in the interestRate variable
    
    System.out.print("Enter the amount of times interest is compounded in a year: ");  // Prompt the user to enter the times compounded 
    timesCompounded = keyboard.nextInt();  // Input times compounded and store it in the timesCompounded variable 
    
    double calcInterest = (principalAmt * (Math.pow((1 + interestRate / timesCompounded / 100), timesCompounded)) - principalAmt);
    double amtInSavings = principalAmt + calcInterest;
    
/*  System.out.println("Interest rate: " + interestRate + "%");
    System.out.println("Times compounded: " + timesCompounded); 
    System.out.println("Original principal: " + NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(principalAmt));
    System.out.println("Interest earned: " + NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(calcInterest));
    System.out.println("Amount in savings: " + NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(amtInSavings));
*/
    
    System.out.printf("%-30s %.2f %%\n", "Interest rate:", interestRate);
    System.out.printf("%-30s %d \n", "Times compounded:", timesCompounded); 
    System.out.printf("%-30s $%.2f \n", "Original principal:", principalAmt);
    System.out.printf("%-30s $%.2f \n", "Interest earned:", calcInterest);
    System.out.printf("%-30s $%.2f \n", "Amount in savings: ", amtInSavings);

// Results output to customer 
    
    // **************** End Interest Earned code area ******************
    
    }
    
}

