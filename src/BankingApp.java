import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        CheckBalance name = new CheckBalance();
        //Dog dog = new Dog();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Full Name:");
        String nameAdd = sc.nextLine();
        System.out.println("Please Enter Your Starting Balance:");
        double balanceAdd = sc.nextDouble();

        while (true) {
            System.out.println("Bank of the Philippines");
            System.out.println("[1]Check Balance\n[2]Add Funds\n[3]Transfer Funds\n[4]Exit");
            System.out.print("Please Enter the Number You Want To Perform:");
            int choice = sc.nextInt();

            if (choice ==4)
            {
                System.out.println("Thank You!!");
                break;
            }
            double newValue = 0;
            name.checkBalance(choice, nameAdd, balanceAdd, newValue);
            balanceAdd = newValue + balanceAdd;
            if (choice == 1) {
                System.out.println("Your full name is: "+ nameAdd +" and your balance is: "+ balanceAdd);
            }
        }
    }

    public static class CheckBalance{
        double checkBalance(int choice, String nameAdd, double balanceAdd, double newValue) {
            Scanner sc = new Scanner(System.in);

            switch (choice){

                case 2:
                    System.out.print("Please Enter the Amount You Want To Add:");
                    double add  = sc.nextDouble();
                    balanceAdd = balanceAdd + add;
                    return (newValue);

                case 3:
                    System.out.print("Please Enter the Amount You Want To Transfer:");
                    double transfer  = sc.nextDouble();
                    if (transfer > balanceAdd)
                    {
                        System.out.println("Invalid Transaction");
                    }
                    else {
                        balanceAdd = balanceAdd - transfer;
                        return (newValue);
                    }
            }
            return (newValue);
        }
    }

}
