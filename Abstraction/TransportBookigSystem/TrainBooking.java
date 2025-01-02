package Abstraction.TransportBookigSystem;

public class TrainBooking extends TransportBooking {
    private double fare = 100.0; // Example fare
    private int availableSeats = 5; // Example available seats

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