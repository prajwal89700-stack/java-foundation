class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class WalletAccount {
    private String accountHolder;
    private long balanceInPaise;

    public WalletAccount(String accountHolder, long balanceInPaise) {
        this.accountHolder = accountHolder;
        this.balanceInPaise = balanceInPaise;
    }

    public void withdraw(long amountInPaise) {
        if (amountInPaise <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if (amountInPaise > balanceInPaise) {
            throw new InsufficientBalanceException("Insufficient balance: Requested " + amountInPaise + " but available is " + this.balanceInPaise);
        }
        this.balanceInPaise -= amountInPaise;
        System.out.println("Withdrawal of " + amountInPaise + " paise successful! Remaining balance: " + this.balanceInPaise);

    }
}
public class ExceptionTrace {
        public static void main(String[] args){
            WalletAccount account  = new WalletAccount("Prajwal", 50000L);
            try{
                System.out.println("Attempting withdrawal of 70000 paise...");
                account.withdraw(70000L);
            }catch (InsufficientBalanceException ex) {
                System.out.println("Caught business error: " + ex.getMessage());
            }
            try {
                System.out.println("Attempting withdrawal of -1000 paise...");
                account.withdraw(-1000L);
            }catch (IllegalArgumentException ex) {
                System.out.println("Caught input error: " + ex.getMessage());
            }

            System.out.println("Transaction processing complete. Server is active.");
        }
}

