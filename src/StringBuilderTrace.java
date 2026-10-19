public class StringBuilderTrace {
    public static void main(String[] args){
        StringBuilder ticket = new StringBuilder("Ticket");
        ticket.append("-A1");
        ticket.append("-Confirmed");
        System.out.println(ticket.toString());
        StringBuilder seatList = new StringBuilder();
        for(int i = 1; i <= 5; i++){
            seatList.append(i).append(",");
        }
        System.out.println("Seats: " + seatList.toString());
    }
}
