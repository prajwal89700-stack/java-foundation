public class LinearSearch {
    public static void main(String[] args){
        int[] transactions = {500,200, 900, 400,150};
        int target = 400;
        int foundIndex = -1;
        for( int i = 0; i < transactions.length; i++){
            if( transactions[i] == target){
                foundIndex = i;
                break;
            }

        }
        System.out.println("Target found at index: " + foundIndex);
    }
}
