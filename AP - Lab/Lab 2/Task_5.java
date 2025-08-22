class Flight {
    String flightNumber;
    String Destination;
    int seatCapacity;
    int bookedSeats;

    void setFlight(String flNum, String dest, int seatCap) {
        flightNumber = flNum;
        Destination = dest;
        seatCapacity = seatCap;
        bookedSeats = 0;
    }

    void bookSeat(int seats){
        if (seats <= seatCapacity - bookedSeats) {
            bookedSeats += seats;
            System.out.println("Seats Booked Successfully");
        } else {
            System.out.println("Not Enough Seats Available");
            
        }
    }

    void ShowFlightDetails() {
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Destination: " + Destination);
        System.out.println("Seat Capacity: " + seatCapacity);
        System.out.println("Booked Seats: " + bookedSeats);
        System.out.println("Available Seats: " + (seatCapacity - bookedSeats));
    }
}




public class Task_5 {
    public static void main(String arg[]) {
        System.out.println("Md. Nafijur Rahaman\n\n");

        Flight f1 = new Flight();
        f1.setFlight("B-123", "Dhaka", 100);

        System.out.println("Before Booking Seats: \n\n");

        f1.ShowFlightDetails();

        System.out.println("\n\nAfter Booking Seats: \n\n");

        
        f1.bookSeat(5);
        f1.ShowFlightDetails();

        System.out.println("\n\nId: 20234103116");
    }
}
