import java.util.Scanner;

public class bank{
    public static void main(String[] args) {
        int balance = 30000,withdraw , deposit;
        Scanner atm = new Scanner(System.in);
        while(true)
        {
            System.out.println("Automated Tailer Machine");
            System.err.println(" 1.Withdraw");
            System.err.println(" 2.Deposit");
            System.err.println(" 3.Check Balance");
            System.err.println(" 4.EXIT");
            System.err.println("what  operation you want choose");
            int n = atm.nextInt();
            switch(n)
            {
                case 1 :
                System.err.println("Enter How Much Money You Want To withdraw:");
                withdraw = atm.nextInt();
                if (balance >=withdraw)
                {
                    balance = balance - withdraw;
                    System.err.println("Your Money Has Been Withdraw Please Collect Your Money");

                }
                else {
                    System.out.println("Insufficient Balance");

                }
                System.err.println("");
                break;
                case 2 :
                System.err.println("Enter the money you want to deposit");
                deposit =  atm.nextInt();
                balance = balance + deposit;
                System.err.println("Your money sucessfully deposit in your bank account");
                System.err.println("");
                break;
                case 3:
                System.err.println("Balance :"+balance);
                System.err.println("");
                break;
                case 4 :
                System.exit(0);
            }
        }
    }
}