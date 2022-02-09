public class TestBankAccount {

    public static void main(String[] args){
        BankAccount account1 = new BankAccount();
        account1.depositFunds("checking", 1500);
        account1.depositFunds("savings", 1500);
        System.out.println( account1.getCheckingBalance());
        System.out.println(account1.getSavingsBalance());
        account1.withdrawFunds("checking", 500);
        account1.withdrawFunds("savings", 550);
        System.out.println( account1.getCheckingBalance());
        System.out.println(account1.getSavingsBalance());
        System.out.println(BankAccount.getBankTotal());
        BankAccount account2 = new BankAccount();
        System.out.println(BankAccount.getNumberOfAccounts());
    }

    }