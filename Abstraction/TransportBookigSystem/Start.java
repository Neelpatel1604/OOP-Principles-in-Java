package Abstraction.TransportBookigSystem;

public class Start {
    public static void main(String[] args) {
        // Bus Booking
        TransportBooking busBooking = new BusBooking();
        busBooking.bookSeat();
        System.out.println("Bus Fare: " + busBooking.calculateFare());
        System.out.println("Available Seats: " + busBooking.getAvailableSeats());

        // Train Booking
        TransportBooking trainBooking = new TrainBooking();
        trainBooking.bookSeat();
        System.out.println("Train Fare: " + trainBooking.calculateFare());
        System.out.println("Available Seats: " + trainBooking.getAvailableSeats());

        // Flight Booking
        TransportBooking flightBooking = new FlightBooking();
        flightBooking.bookSeat();
        System.out.println("Flight Fare: " + flightBooking.calculateFare());
        System.out.println("Available Seats: " + flightBooking.getAvailableSeats());
    }
}
