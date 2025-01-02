# Transport Booking System

## Project Overview
This project demonstrates a Transport Booking System that utilizes abstraction to manage various types of transport bookings, including buses, trains, and flights. It showcases the principles of Object-Oriented Programming (OOP) through the use of abstract classes and concrete implementations.

### Class Descriptions

1. **TransportBooking.java**
   - This abstract class defines methods for transport booking functionalities.
   - **Methods**:
     - `calculateFare()`: Calculates the fare for the transport.
     - `getAvailableSeats()`: Returns the number of available seats.
     - `bookSeat()`: Books a seat for the transport.

2. **BusBooking.java**
   - This class extends the `TransportBooking` abstract class, providing specific implementations for bus bookings.
   - **Functionality**:
     - Defines fare structure and seat availability logic for bus transport.
     - Implements methods to calculate fare, check available seats, and book a seat.

3. **TrainBooking.java**
   - This class extends the `TransportBooking` abstract class, providing specific implementations for train bookings.
   - **Functionality**:
     - Defines fare structure and seat availability logic for train transport.
     - Implements methods to calculate fare, check available seats, and book a seat.

4. **FlightBooking.java**
   - This class extends the `TransportBooking` abstract class, providing specific implementations for flight bookings.
   - **Functionality**:
     - Defines fare structure and seat availability logic for flight transport.
     - Implements methods to calculate fare, check available seats, and book a seat.

5. **Start.java**
   - This is the main class that runs the application. It creates instances of `BusBooking`, `TrainBooking`, and `FlightBooking`, performs various actions, and demonstrates the functionalities.
   - **Functionality**:
     - Instantiate transport booking objects.
     - Perform actions like booking seats and displaying fare and available seats.
     - Demonstrates the use of abstraction in managing different transport types.

### How to Run
1. Compile all Java files in the `Abstraction/TransportBookigSystem` directory.
2. Run the `Start` class to execute the program.

### Example Output
When you run the program, it will display the following actions performed by the transport booking system:
- Seat booked successfully for the bus.
- Bus Fare: 50.0
- Available Seats: 9
- Seat booked successfully for the train.
- Train Fare: 100.0
- Available Seats: 4
- Seat booked successfully for the flight.
- Flight Fare: 300.0
- Available Seats: 19 