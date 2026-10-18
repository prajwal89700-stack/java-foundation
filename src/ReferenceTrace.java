public class ReferenceTrace {
    public static void main(String[] args){
        int x = 10;
        int y = x;
        y = 99;
        int[] pricesA = {10,20,30};
        int[] pricesB = pricesA;
        pricesB[0] = 99;

        System.out.println("x = " + x);
        System.out.println("pricesA[0] = " + pricesA[0]);
    }
}