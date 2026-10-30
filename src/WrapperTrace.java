public class WrapperTrace {
    public static void main(String[] args){
        Integer x = 127;
        Integer y = 127;
        System.out.println("Test 1 (127==127): " + (x==y));

        Integer p = 128;
        Integer q = 128;
        System.out.println("Test 2 (128==128): " + (p == q));
        System.out.println("Test 3 (128.equals(128)): " + p.equals(q));

        Long bal1 = 50000L;
        Long bal2 = 50000L;
        System.out.println("Test 4 (50000L == 50000L): " + (bal1==bal2));
        System.out.println("Test 5 (bal1.equals(bal2)): " + bal1.equals(bal2));

        Integer bonus = null;
        try{
            long total = 1000L + bonus;
            System.out.println("Total: " + total);
        }catch(NullPointerException e){
            System.out.println("Caught expected Exception: " + e.getClass().getSimpleName());
        }
    }
}
