public class BankAccount {

    private double checkingBalance ;
    private double savingsBalance ;
    private static double numberOfAccounts;
    private static double bankAccountTotal;


    public BankAccount(){
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        numberOfAccounts += 1;
    }

    public void depositFunds(String accountType, double amount){
        if(accountType == "checking"){
            this.checkingBalance += amount;
            bankAccountTotal += amount;
        }
        if(accountType == "savings"){
            this.savingsBalance += amount;
            bankAccountTotal += amount;
        }
    }
    public void withdrawFunds(String accountType, double amount){
        if(accountType == "checking" && this.getCheckingBalance() >= amount){
            this.checkingBalance -= amount;
            bankAccountTotal -= amount;
        }
        else if(accountType == "savings" && this.getSavingsBalance() >= amount){
            this.savingsBalance -= amount;
            bankAccountTotal -= amount;
        }else {
            System.out.println("Insufficient funds");
        }
    }

    public static double getNumberOfAccounts(){
        return numberOfAccounts;
    }
    public static double getBankTotal(){
        return bankAccountTotal;
    }
    public double getCheckingBalance(){
        return this.checkingBalance;
    }
    public double getSavingsBalance(){
        return this.savingsBalance;
    }


}