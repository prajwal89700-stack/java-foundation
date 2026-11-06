@FunctionalInterface
interface TransactionFilter {
    boolean isAllowed(long amountInPaise);
}

class LambdaTrace {
    public static void main(String[] args){
        TransactionFilter vipFilter = amountInPaise -> amountInPaise >= 100000L;
        TransactionFilter antiFraudFilter = amountInPaise -> amountInPaise <= 500000;

        long amountInPaise = 600000;

        System.out.println("Is 250000 paise VIP? " + vipFilter.isAllowed(amountInPaise));
        System.out.println("Is 250000 paise under fraud limit? " + antiFraudFilter.isAllowed(amountInPaise));
    }
}
