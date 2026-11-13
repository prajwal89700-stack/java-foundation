import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

class SafeWallet{
    private long syncBalance = 0L;
    private AtomicLong atomicBalance = new AtomicLong(0L);
    public synchronized void depositSync(){
        syncBalance++;
    }
    public void depositAtomic(){
        atomicBalance.incrementAndGet();
    }
    public synchronized long getSyncBalance(){
        return syncBalance;
    }
   public synchronized long getAtomicBalance(){
        return atomicBalance.get();
   }
}
public class SafeConcurrencyTrace {
    public static void main(String[] args) throws InterruptedException {
        SafeWallet wallet = new SafeWallet();
        ExecutorService pool = Executors.newFixedThreadPool(2);
        Runnable task = () -> {
            for (int i = 0; i < 10_000; i++){
                wallet.depositSync();
                wallet.depositAtomic();
            }
        };
        pool.submit(task);
        pool.submit(task);

        pool.shutdown();
        pool.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("Sync Balance:  " + wallet.getSyncBalance());
        System.out.println("Atomic Balance: " + wallet.getAtomicBalance());
    }
}
