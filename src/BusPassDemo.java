public class BusPassDemo {
    String passengerName;
    int tripsRemaining;

    BusPassDemo(String passengerName, int tripsRemaining) {
        this.passengerName = passengerName;
        this.tripsRemaining = tripsRemaining;
    }

    void addTrips(int extraTrips) {
        if (extraTrips > 0 && extraTrips % 5 == 0) {
            this.tripsRemaining = this.tripsRemaining + extraTrips;
        } else {
            System.out.println("Recharge must be a positive multiple of 5");
        }
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

    public static void main(String[] args) {
        BusPassDemo p1 = new BusPassDemo("Prajwal", 10);
        p1.addTrips(3);
        p1.addTrips(5);

        boolean s1 = p1.swipePass();
        System.out.println(p1.passengerName + " " + p1.tripsRemaining + " " + s1);
    }
}