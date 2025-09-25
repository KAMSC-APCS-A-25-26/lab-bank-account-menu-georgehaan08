import java.util.Scanner;

public class BankAccountMenu {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double balance = 0;
        boolean status = true;
        while(status)
        {
            System.out.println("--- Bank Account Menu ---");
            System.out.println("1. Add Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Make a selection: ");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:

                    System.out.print("How much would you like to add?: ");
                    double x = sc.nextInt();
                    if(x >= 0)
                    {
                        balance += x;
                        System.out.println("Added " + balance);
                        System.out.println("Current Balance: " + balance);
                    }
                    else
                    {
                        System.out.println("Error");
                    }
                    break;


                case 2:

                    System.out.print("How much would you like to subtract?: ");
                    double y = sc.nextInt();
                    if(y <= balance)
                    {
                        balance -= y;
                        System.out.println("Withdrew " + balance);
                        System.out.println("Current Balance: " + balance);
                    }
                    else
                    {
                        System.out.println("Error");
                    }
                    break;

                case 3:

                    System.out.println("Current Balance: " + balance);
                    break;


                case 4:

                    status = false;
                    System.out.println("Goodbye!");
                    break;

            }
        }


    }
}