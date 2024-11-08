import java.util.*;

public class LabOne
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String userInput = new String();

            System.out.println("Enter a card number to check");
            userInput = sc.nextLine();
            if(userInput.length() < 4 || userInput.length() > 30)
            {
                System.out.println("Invalid, must be between 4 and 30 digits long");
            }
            else
            {
                if(validCardChecker(userInput))
                {
                    System.out.println("Valid");
                }
                else
                {
                    System.out.println("Invalid");
                }
            }
        sc.close();
    }
 
    public static boolean validCardChecker(String cardNumber)
    {
        int modulator = 20;
        int totalDoubledDigits = 0;
        int totalNotDoubledDigits = 0;
        int[] cardNumberDigits = new int[cardNumber.length()];
        //converting from string to array of ints, easier to work with individual digits
        for(int i = 0; i < cardNumberDigits.length; i++)
        {
            cardNumberDigits[i] = Character.getNumericValue(cardNumber.charAt(i));
        } 
        
        int traversedDigits = 1;
        int doubledDigit = 0;
       for(int i = cardNumberDigits.length - 1; i >=0; i--)
       {
            doubledDigit = 2 * cardNumberDigits[i];
            
            if(traversedDigits % 2 == 0)
            {
                if(doubledDigit > 9)
                {
                    totalDoubledDigits += (doubledDigit - 9);
                }
                else
                {
                    totalDoubledDigits +=  doubledDigit;
                }
                
            }
            else
            {
                totalNotDoubledDigits += cardNumberDigits[i];
            }
            traversedDigits++;
       }

       int totalSum = totalDoubledDigits + totalNotDoubledDigits;
       if(totalSum % modulator == 0)
       {
            return true;
       }
       else
       {
            return false;
       }
    }
}