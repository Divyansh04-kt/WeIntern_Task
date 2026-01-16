public class Account{
    private int account_number;
    private String user_name;
    private String account_type;
    private double balance;
    private String account_status;

    public Account(int account_number, String user_name, String account_type, double balance, String account_status){
        this.account_number = account_number;
        this.user_name = user_name;
        this.account_type = account_type;
        this.account_status = account_status;
        this.balance = balance;
    }
    public int getAccountNumber() {
        return account_number;
    }

    public String getName() {
        return user_name;
    }

    public String getAccountType() {
        return account_type;
    }

    public double getBalance() {
        return balance;
    }

    public String getStatus() {
        return account_status;
    }
}