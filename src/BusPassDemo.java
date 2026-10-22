class BusPass {
    private String passengerName;
    private int tripsRemaining;
    private String address;

    BusPass(String passengerName, int tripsRemaining) {
        this.passengerName = passengerName;
        this.tripsRemaining = tripsRemaining;
    }

    boolean swipePass() {
        if (this.tripsRemaining > 0) {
            this.tripsRemaining = this.tripsRemaining - 1;
            return true;
        } else {
            System.out.println("No trips remaining");
            return false;
        }
    }

    void addTrips(int extraTrips) {
        if (extraTrips > 0 && extraTrips % 5 == 0) {
            this.tripsRemaining = this.tripsRemaining + extraTrips;
        } else {
            System.out.println("Recharge must be a positive multiple of 5");
        }
    }

    public String getPassengerName() {
        return this.passengerName;
    }

    public int getTripsRemaining() {
        return this.tripsRemaining;
    }
    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }
}

public class BusPassDemo {
    public static void main(String[] args) {
        BusPass p1 = new BusPass("Prajwal", 10);
        p1.addTrips(3);
        p1.addTrips(5);
        boolean s1 = p1.swipePass();
        p1.setPassengerName("Prajwal");
        p1.setPassengerName("Asha");
        System.out.println(p1.getPassengerName() + " " + p1.getTripsRemaining() + " " + s1);
    }
}