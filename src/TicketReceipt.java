public class TicketReceipt {
    public static void main(String[] args){
        int seatsBooked = 3;
        long pricePerSeatInPaise = 15000L;
        long totalFareInPaise = seatsBooked * pricePerSeatInPaise;
        if(totalFareInPaise >= 40000L){
            System.out.println("Discount eligible");
        }else{
            System.out.println("Regular fare");
        }
        System.out.println("Total in paise: " + totalFareInPaise);
    }
}
