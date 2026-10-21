class Wallet {
    String owner;
    long balanceInPaise;

    Wallet(String owner, long balanceInPaise) {
        this.owner = owner;
        this.balanceInPaise = balanceInPaise;
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
}

public class WalletOopDemo {
    public static void main(String[] args) {
        Wallet w1 = new Wallet("Prajwal", 50000L);
        Wallet w2 = new Wallet("Asha", 20000L);


        w1.deposit(10000L);
        boolean r1 = w1.withdraw(15000L);
        boolean r2 = w2.withdraw(30000L);

        System.out.println(w1.owner + " balance: " + w1.balanceInPaise);
        System.out.println(w2.owner + " balance: " + w2.balanceInPaise);
        System.out.println("w1 withdraw success: " + r1);
        System.out.println("w2 withdraw success: " + r2);
    }
}
