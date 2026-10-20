class Wallet {
    String owner;
    long balanceInPaise;

    Wallet(String owner, long balanceInPaise){
        this.owner = owner;
        this.balanceInPaise = balanceInPaise;
}
void deposit(long amountInPaise){
        if(amountInPaise > 0){
            this.balanceInPaise = this.balanceInPaise + amountInPaise;
        }
}
}
public class WalletOopDemo {
    public static void main(String[] args){
    Wallet w1 = new Wallet("Prajwal", 50000L);
    Wallet w2 = new Wallet("Asha", 20000L);

    w1.deposit(10000L);

    System.out.println(w1.owner + " balance: " + w1.balanceInPaise);
    System.out.println(w2.owner + " balance: " + w2.balanceInPaise);
    }
}
