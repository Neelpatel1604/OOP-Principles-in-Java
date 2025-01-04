# Weather Station Project Instructions

## Overview
You have been tasked with developing a Weather Station simulation that gathers wind data using a simulated WindData instrument. The design follows the Dependency Inversion principle, allowing for easy swapping of the simulated instrument with a real one when it becomes available.

## Instructions

### Part A: Create the WindData Class
1. **Purpose**: This class will represent wind data, encapsulating the wind speed and direction.
2. **Constructor**:
   - `WindData(int windSpeed, int windDirection)`: 
     - Initializes the wind data with the specified speed and direction.
     - **Validation**: Ensure that:
       - Wind speed is between 0 and 80 kph.
       - Wind direction is between 0 and 359 degrees.
     - If the values are invalid, throw an `IllegalArgumentException` with an appropriate message.
3. **Methods**:
   - `getWindSpeed()`: Returns the wind speed.
   - `getWindDirection()`: Returns the wind direction.

### Part B: Create the WindGaugeSimulator Class
1. **Purpose**: This class simulates a wind gauge that generates random but valid wind data.
2. **Methods**:
   - `getWindData()`: 
     - Returns a `WindData` object with:
       - Random wind speed between 0 and 80 kph.
       - Random wind direction between 0 and 359 degrees.

### Part C: Create the WeatherStation Class
1. **Purpose**: This class represents a weather station that collects wind data.
2. **Constructor**:
   - `WeatherStation(String location, WindMeasurementDevice windGuage)`:
     - Initializes the station with a specified location and a wind measurement device.
3. **Methods**:
   - `getWindReading()`: 
     - Collects wind data from the wind gauge and stores it in an internal list.
   - `getWindReport()`: 
     - Returns a formatted string report of all collected wind readings.

### Part D: Create the Start Class
1. **Purpose**: This is the main class that runs the application.
2. **Functionality**:
   - Instantiate a `WindGaugeSimulator` and a `WeatherStation`.
   - Call `getWindReading()` from the `WeatherStation` 10 times to collect wind data.
   - Print the wind report using `getWindReport()`.

### How to Run the Project
1. **Compile**: Compile all Java files in the `Polymorphism/WeatherStation` directory.
2. **Execute**: Run the `Start` class to execute the program.

### Example Output
When you run the program, it will display a report of the wind readings collected during the simulation, formatted as follows:
```
------Wind Report---------
    Direction       Speed
    57			            27
    92			            43
    173			            7
    271			            48
    359			            25
    137			            47
    248			            46
    231			            46
    145			            3
    97			            28
```
## Conclusion
By following these instructions, you will create a functional Weather Station simulation that adheres to the principles of Object-Oriented Programming, specifically encapsulation and dependency inversion.
