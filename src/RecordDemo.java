record TransactionReceipt(String transactionId, long amountInPaise, boolean success){}
public class RecordDemo {
    public static void main(String[] args){
        TransactionReceipt receipt = new TransactionReceipt("TXN-1001", 25000L, true);
        System.out.println("ID: " + receipt.transactionId());
        System.out.println("Amount: " + receipt.amountInPaise());
        System.out.println("Success: " + receipt.success());

        System.out.println("Receipt details: " + receipt);

//       receipt.amountInPaise = 50000L;
        receipt.amountInPaise();
    }
}
