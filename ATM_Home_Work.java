import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Boolean Calculate = true ;
        double balance = 0 ;
        System.out.println("Wel Come To SBI ATM");

        while (Calculate)
        {
            System.out.println("Select Your Option");
            System.out.println("1. Deposit (+)");
            System.out.println("2. WithDraw (-)");
            System.out.println("3. Check Balance (=)");
            System.out.println("4. Exit");

            System.out.println("Select Your Option");
            int choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("*****Deposit*****");
                    System.out.println("Enter The Amount You Want To Deposit : Rs. ");
                    double deposit = sc.nextDouble();
                    if (deposit > 0)
                    {
                        balance = balance +  deposit ;
                        System.out.println("Rs" + deposit + " Has Been Deposited Successfully!");
                    }
                    else
                    {
                        System.out.println("Invalid amount.");
                    }
                    break;
                case 2:
                    System.out.println("*****Withdraw*****");
                    System.out.println("Enter The Amount You Want To WithDraw : Rs. ");
                    double withdraw = sc.nextDouble();
                    if (withdraw > 0 && withdraw <= balance)
                    {
                        balance = balance -  withdraw ;
                        System.out.println("Rs" + withdraw + " Has Been WithDrawed Successfully!");
                    }
                    else if (withdraw > balance )
                    {
                        System.out.println("Insufficient Balance.");
                    }
                    else
                    {
                        System.out.println("Invalid Withdrawal Amount.");
                    }
                    break;
                case 3:
                    System.out.println("Balance");
                    System.out.println("Your Current Balance Is: Rs." + balance);
                    break;
                    case 4:
                    System.out.println("Goodbye! Have A Great Day Ahead");
                    Calculate = false;
                    break;
                default:
                    System.out.println("Invalid Choice. Please Select a Valid Operation.");
            }
            System.out.println();
        }
        sc.close();
    }
}