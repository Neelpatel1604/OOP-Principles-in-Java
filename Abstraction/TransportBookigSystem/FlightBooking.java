package Abstraction.TransportBookigSystem;

public class FlightBooking extends TransportBooking {
    private double fare = 300.0; // Example fare
    private int availableSeats = 20; // Example available seats

    @Override
    public double calculateFare() {
        return fare;
    }

    @Override
    public int getAvailableSeats() {
        return availableSeats;
    }

    @Override
    public void bookSeat() {
        if (availableSeats > 0) {
            availableSeats--;
            System.out.println("Seat booked successfully!");
        } else {
            System.out.println("No available seats!");
        }
    }
} 