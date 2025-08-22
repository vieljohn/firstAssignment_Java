
import java.util.Scanner;




public class JavaAssign01 {
        public static void main(String[] args) {

            Scanner userInput = new Scanner(System.in);  //create scanner method
            double userInputWODiscount = getUserInput(userInput);
            double discount = returnAmountWDiscount(userInputWODiscount);
            double finalAmount = userInputWODiscount - discount;

            
            int roundedAmount = (int) Math.round(finalAmount); //to roundoff the final amount which could have decimal 
            int priceoddEven = evenChecker(roundedAmount); // passes it off to another function for checking 


            System.out.println("The Discount amount is: " + discount);
            System.out.println("The Final Price is: " +finalAmount);
           
            if (priceoddEven == 0){
                System.out.println("The Final Price is Even Number"); //Prints if final amount is even 
            }else {
                System.out.println("The Final Price is Odd Number"); // default prints if odd 
            }
            
            userInput.close(); // to close the scanner class

        }


public static double getUserInput(Scanner userInput){ //function for user input only 
    System.out.print("Please enter the purchase amount: ");
    double firstInput= userInput.nextDouble();

    return firstInput;

}

public static double returnAmountWDiscount (double totalAmountWDiscount){

    double newAmount = totalAmountWDiscount;

    if (newAmount >= 1000) {
        return newAmount *0.20; //apply the 20% discount  
    } else if (newAmount >=500){
        return newAmount *0.10; //apply the 10% discount  
    }else return 0; // return no discount 

}

    //For Checking is odd or even by returning 1 or 0 
public static int evenChecker (int finalAmount) {
    int checkFinalAmount = finalAmount;

    if(checkFinalAmount %2 == 0){
    return 0;
    }else {
        return 1; 
    }
    
}

}

  



