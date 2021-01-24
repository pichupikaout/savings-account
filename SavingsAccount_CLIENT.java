/**
 * Mr Marques
 * 
 * Deitel: #8.16 SavingsAccountTest ... the CLIENT
 * 10/15/04
 * 
 * 

 Your expected output is as follows:

========================= Person 1 ================================
Output montly balances for one year at 0.03
 Name: Robert Smith
 Social Security: 012-34-5678
 Birth Date: 5/18/1986
 Start Date: 2/12/2004
 Savings Balance: $2,000.00
 Annual Interest Rate: 0.03

 -- Balance for one year --
   Month 1: 2005.0
   Month 2: 2010.0125
   Month 3: 2015.03753125
   Month 4: 2020.075125078125
   Month 5: 2025.1253128908204
   Month 6: 2030.1881261730475
   Month 7: 2035.26359648848
   Month 8: 2040.3517554797013
   Month 9: 2045.4526348684005
   Month 10: 2050.5662664555716
   Month 11: 2055.6926821217107
   Month 12: 2060.831913827015

After setting interest rate to 0.04 & 
 calculating another month: $2,067.70



========================= Person 2 ================================
Output montly balances for one year at 0.03
 Name: Mary Jones
 Social Security: 987-65-4321
 Birth Date: 3/17/1987
 Start Date: 7/28/2004
 Savings Balance: $3,000.00
 Annual Interest Rate: 0.03

 -- Balance for one year --
   Month 1: 3007.5
   Month 2: 3015.01875
   Month 3: 3022.556296875
   Month 4: 3030.1126876171875
   Month 5: 3037.6879693362303
   Month 6: 3045.2821892595707
   Month 7: 3052.8953947327195
   Month 8: 3060.5276332195513
   Month 9: 3068.1789523026
   Month 10: 3075.8493996833563
   Month 11: 3083.5390231825645
   Month 12: 3091.2478707405207

After setting interest rate to 0.04 & 
 calculating another month: $3,101.55
 
*/


public class SavingsAccount_CLIENT
{
    public static void main(String[] args)
    {
     SavingsAccount s1 = new SavingsAccount("Robert","Smith","012-34-5678", 5, 18, 1986, 2, 12, 2004, 2000.00);
     SavingsAccount s2 = new SavingsAccount("Mary","Jones","987-65-4321", 3, 17, 1987, 7, 28, 2004, 3000.00);                   

     // ========================= Person 1 ================================
        // modify the 'static' annualInterestRate
        SavingsAccount.modifyInterestRate(0.03);
        
        // output first person
        System.out.println("========================= Person 1 ================================");
        System.out.println("Output montly balances for one year at " + SavingsAccount.getAnnualInterestRate());

        System.out.println(s1);     
        System.out.println();
        System.out.println(" -- Balance for one year --");
        
        for (int i=1; i<=12; i++) {
            s1.calculateMonthlyInterest();
            System.out.println("   Month " + i + ": " + s1.getSavingsBalance() );
        }
        SavingsAccount.modifyInterestRate(0.04);
        s1.calculateMonthlyInterest();
        System.out.println("\nAfter setting interest rate to 0.04 & \n" + 
                           " calculating another month: " + s1.printBalance());
        
     // ========================= Person 2 ================================
        // modify the 'static' annualInterestRate
        SavingsAccount.modifyInterestRate(0.03);
        
        // output second person
        System.out.println("\n\n");
        System.out.println("========================= Person 2 ================================");        
        System.out.println("Output montly balances for one year at " + SavingsAccount.getAnnualInterestRate());

        System.out.println(s2);     
        System.out.println();
        System.out.println(" -- Balance for one year --");
        
        for (int i=1; i<=12; i++) {
            s2.calculateMonthlyInterest();
            System.out.println("   Month " + i + ": " + s2.getSavingsBalance() );
        }
        SavingsAccount.modifyInterestRate(0.04);
        s2.calculateMonthlyInterest();
        System.out.println("\nAfter setting interest rate to 0.04 & \n" + 
                           " calculating another month: " + s2.printBalance());
    }


} // SavingsAccount
