class Driver {

    String name;
    int tripsCompleted;
    int earningPerTip;

    void setDriver(String n, int trip, int earn) {
        name = n;
        tripsCompleted = trip;
        earningPerTip = earn;
    }

    int calculateTotalEarnings() {
        return tripsCompleted * earningPerTip;
    }

    void showDriver() {
        System.out.println("Name: " + name);
        System.out.println("TripsCompleted: " + tripsCompleted);
        System.out.println("EarningPerTip: " + earningPerTip);
    }

}

public class Task_2 {
    public static void main(String arg[]) {
        System.out.println("Md. Nafijur Rahaman\n\n");

        Driver d = new Driver();

        d.setDriver("Tanjid", 5, 100);
        d.showDriver();
        int earnMoney = d.calculateTotalEarnings();

        System.out.println("Earning By Driver: " + earnMoney);
        
        System.out.println("\n\nId: 20234103116");

    }
}
