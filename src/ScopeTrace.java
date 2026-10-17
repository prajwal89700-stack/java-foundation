public class ScopeTrace {
    public static void main(String[] args){
        int balance = 1000;
        resetBalance(balance);
        System.out.println("In main: " + balance);
        balance = deductFee(balance, 200);
        System.out.println("In main after deductFee: " + balance);
    }
    public static void resetBalance(int balance){
        balance = 0;
        System.out. println("In resetBalance: " + balance);
    }
    public static int deductFee(int balance, int fee){
        int deductedFee = balance - fee;
        return deductedFee;
    }
}