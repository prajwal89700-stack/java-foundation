public class MaxTransactionFinder {
    public static void main(String[] args){
        int[] transactions = {500, 200, 900, 400,150};
         int max = transactions[0];
         int min = transactions[0];
        for( int i = 1; i < transactions.length; i++){
            if(transactions[i] > max){
                max = transactions[i];
            } else if(transactions[i] < min){
                min = transactions[i];
            }
        }
        System.out.println("Highest transaction: " + max);
    System.out.println("Lowest transaction: " + min);
    }
}