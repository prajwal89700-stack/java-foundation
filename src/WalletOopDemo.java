class Wallet {
    private String owner;
    private long balanceInPaise;

    static int totalWalletsCreated = 0;

    Wallet(String owner, long balanceInPaise) {
        this.owner = owner;
        this.balanceInPaise = balanceInPaise;
        totalWalletsCreated++;// totalWalletsCreated = totalWalletsCreated + 1;
    }

    void deposit(long amountInPaise) {
        if (amountInPaise > 0) {
            this.balanceInPaise = this.balanceInPaise + amountInPaise;
        }
    }

    boolean withdraw(long amountInPaise) {
        if (amountInPaise > 0 && amountInPaise <= this.balanceInPaise) {
            this.balanceInPaise = this.balanceInPaise - amountInPaise;
            return true;
        } else {
            System.out.println("Insufficient balance");
            return false;
        }
    }

    public String getOwner() {
        return this.owner;
    }

    public long getBalanceInPaise() {
        return this.balanceInPaise;
    }
}

class CashbackWallet extends Wallet {
    CashbackWallet(String owner, long balanceInPaise) {
        super(owner, balanceInPaise);
    }

    public void printCashbackRate() {
        System.out.println("Cashback rate: 1%");
    }

    @Override
    void deposit(long amountInPaise) {
        if (amountInPaise > 0) {
            long cashback = amountInPaise / 100;
            super.deposit(amountInPaise + cashback);
        }
    }
}


public class WalletOopDemo {
    public static void main(String[] args) {
//        Wallet w1 = new Wallet("Prajwal", 50000L);
//        Wallet w2 = new Wallet("Asha", 20000L);
//
//
//        w1.deposit(10000L);
//        boolean r1 = w1.withdraw(15000L);
//        boolean r2 = w2.withdraw(30000L);
//
//
//        System.out.println(w1.owner + " balance: " + w1.balanceInPaise);
//        System.out.println(w2.owner + " balance: " + w2.balanceInPaise);
//        System.out.println("w1 withdraw success: " + r1);
//        System.out.println("w2 withdraw success: " + r2);
//        System.out.println("Start count: " + Wallet.totalWalletsCreated);
//        Wallet b1 = new Wallet("Prajwal", 50000L);
//        Wallet b2 = new Wallet("Asha", 20000L);
//        Wallet b3 = new Wallet("Ravi", 10000L);
//        System.out.println("End count: " + Wallet.totalWalletsCreated);
//        Wallet w1 = new Wallet("Prajwal", 50000L);
//        System.out.println("Owner: " + w1.getOwner());
//        System.out.println("Starting Balance: " + w1.getBalanceInPaise());
//
//        w1.deposit(10000L);
//        System.out.println("After deposit: " + w1.getBalanceInPaise());
//
//        boolean success = w1.withdraw(25000L);
//        System.out.println("Withdrawal successful: " + success);
//        System.out.println("Final Balance: " + w1.getBalanceInPaise());
//        CashbackWallet cw = new CashbackWallet("Prajwal", 50000L);
//        cw.deposit(10000L);
//        System.out.println("Owner: " + cw.getOwner());
//        System.out.println("Final Balance: " + cw.getBalanceInPaise());
        Wallet w1 = new Wallet("Asha", 50000L);
        Wallet w2 = new CashbackWallet("Prajwal", 50000L);
        w1.deposit(10000L);
        w2.deposit(10000L);

        System.out.println("w1 balance: " + w1.getBalanceInPaise());
        System.out.println("w2 balance: " + w2.getBalanceInPaise());
        ((CashbackWallet) w2).printCashbackRate();
    }
}
