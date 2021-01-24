
/*
 * Deitel Java: #8.16 SavingsAccount
 */

import java.text.NumberFormat;
import java.util.Locale;

public class SavingsAccount  // take out the word "Shell"
{
private String myFirstName;
private String myLastName;
private final String mySSnum; 
private double mySavingsBalance;
private static double myAnnualInterestRate;
private Date myBirthDate;
private Date myStartDate;

    // ------------------------- Constructors --------------------------
    public SavingsAccount()
    {
        this("","","",0,0,0,0,0,0,0.0);
        
        myAnnualInterestRate = 0.0;
    }
    public SavingsAccount(String firstName, String lastName, String ss,
                          int bMonth, int bDay, int bYear, int sMonth, int sDay, int sYear, double sb)
    {  
        this.myFirstName = firstName;
        this.myLastName = lastName;
        this.mySSnum = ss;
        myBirthDate = new Date(bMonth, bDay, bYear);
        myStartDate = new Date(sMonth, sDay, sYear);
        this.mySavingsBalance = sb;
    }
    // ---------------------------------------------------------------------
    public void calculateMonthlyInterest()
    {
        this.mySavingsBalance = this.mySavingsBalance * (1+(myAnnualInterestRate * 1/12));
    }
    // ---------------------------------------------------------------------
    public static void modifyInterestRate(double apr) // (1) WHY is this method "static"? (2)Take out "static" and what happens?
    {
        myAnnualInterestRate = apr;
    }
    // ---------------------------------------------------------------------
    public static double getAnnualInterestRate() // (1) WHY is this method "static"? (2)Take out "static" and what happens?
    {
         return myAnnualInterestRate;
    }
    // ---------------------------------------------------------------------
    public double getSavingsBalance()
    {
          return this.mySavingsBalance;
    }    
    // ---------------------------------------------------------------------    
    public String printBalance()
    {
    NumberFormat moneyFormat = NumberFormat.getCurrencyInstance(Locale.US);                      

           return moneyFormat.format(mySavingsBalance)+"\n";           
    }
    // ---------------------------------------------------------------------    
    public String toString()
    {  
         return this.myFirstName + " " + this.myLastName + " " + this.mySSnum + "\n" + this.myBirthDate.toString() + "\n" + this.myStartDate.toString();
    }
    
    
}


