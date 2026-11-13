class UnsafeWallet{
    private long balanceInPaise = 0L;
    public void depositOnePaisa(){
        balanceInPaise = balanceInPaise + 1;
    }
    public long getBalanceInPaise(){
        return balanceInPaise;
    }
}
public class ConcurrencyTrace {
    public static void main(String[] args)throws InterruptedException{
        UnsafeWallet wallet = new UnsafeWallet();
        Runnable depositTask = () -> {
            for(int i = 1; i < 10_000; i++){
                wallet.depositOnePaisa();
            }
        };
        Thread t1 = new Thread(depositTask);
        Thread t2 = new Thread(depositTask);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Actual balance: " + wallet.getBalanceInPaise());
        }
        }


