public class DiscountCalculator {
    public static void main(String[] args){
        int ticketPrice = 400;
        int discountPercent = 15;
        int discountAmount = (ticketPrice * discountPercent) / 100;
        int finalPrice = ticketPrice - discountAmount;
        System.out.println("Discount amount: " + discountAmount);
        System.out.println("Final price: " + finalPrice);
    }
}
