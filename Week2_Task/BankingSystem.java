import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        AccountDao dao = new AccountDao();

        while (true) {
            System.out.println("\n BANKING SYSTEM ");
            System.out.println("Insert a number for performing any operation - ");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Thank you!");
                break;
            }

            System.out.print("Enter Account Number: ");
            int accNo = sc.nextInt();

            if (choice == 1) {
                sc.nextLine();
                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Account Type (Savings/Current): ");
                String type = sc.nextLine();

                dao.createAccount(accNo, name, type);
                System.out.println("Account created successfully!");

            } else {
                Account acc = dao.getAccount(accNo);

                if (acc == null || !acc.getStatus().equals("Active")) {
                    System.out.println("Account not found!");
                    continue;
                }

                if (choice == 2) {
                    System.out.print("Deposit amount: ");
                    double amt = sc.nextDouble();

                    dao.updateBalance(accNo, acc.getBalance() + amt);
                    System.out.println("Deposit successful!");

                } 
                else if (choice == 3) {
                    System.out.print("Withdraw amount: ");
                    double amt = sc.nextDouble();

                    if (amt > acc.getBalance()) {
                        System.out.println("Insufficient balance!");
                    } else {
                        dao.updateBalance(accNo, acc.getBalance() - amt);
                        System.out.println("Withdrawal successful!");
                    }

                } 
                else if (choice == 4) {
                    System.out.println("Name: " + acc.getName());
                    System.out.println("Type: " + acc.getAccountType());
                    System.out.println("Balance: " + acc.getBalance());
                    System.out.println("Status: " + acc.getStatus());
                }
            }
        }
    }
}
