# Employee Timesheet Manager

## Project Overview
This project also includes an Employee Timesheet Management system that demonstrates the encapsulation principle of Object-Oriented Programming (OOP). It allows for the management of employee timesheets, calculation of wages based on hours worked, and employee types.

### Class Descriptions

1. **EmployeeType.java**
   - This class defines an enumeration for different employee types (JUNIOR, ASSOCIATE, SENIOR) and their corresponding hourly rates.
   - **Methods**:
     - `getHourlyRate()`: Returns the hourly rate for the employee type.
   - **Enumerated Values**:
     - `JUNIOR`: $20/hour
     - `ASSOCIATE`: $50/hour
     - `SENIOR`: $80/hour

2. **EmployeeTimeSheet.java**
   - This class represents an employee's timesheet, containing information about the employee's name, ID, hours worked, and their type.
   - **Constructor**:
     - `EmployeeTimeSheet(String employeeName, int employeeId, double noOfHours, EmployeeType employeetype)`: Initializes the employee's details.
   - **Methods**:
     - `wageCalculator()`: Calculates the total wage based on hours worked and the employee's hourly rate.
     - `getEmployeeName()`: Returns the employee's name.
     - `getEmployeeId()`: Returns the employee's ID.
     - `getNoOfHours()`: Returns the number of hours worked.

3. **TimeSheetManager.java**
   - This class manages multiple employee timesheets, allowing for the addition of timesheets and calculation of total wages.
   - **Instance Variable**:
     - An array that can contain up to 20 `EmployeeTimeSheet` instances.
   - **Methods**:
     - `addTimeSheet(EmployeeTimeSheet timeSheet)`: Adds a new timesheet to the manager.
     - `getTotalWagesForThisWeek()`: Calculates the total wages for all employees for the week.
     - `printPayStubs()`: Prints the pay stubs for all employees in the array.
       - Output format: `<name> <employeeNumber> <hoursWorked> <paymentOwed>`

4. **Start.java**
   - This is the main class that runs the application. It creates instances of `EmployeeTimeSheet` and `TimeSheetManager`, adds timesheets, and displays total wages and pay stubs.
   - **Functionality**:
     - Instantiate 5 `EmployeeTimeSheet` objects.
     - Add them to the `TimeSheetManager` via the `addTimeSheet` method.
     - Print out the total cost of all wages for the week.
     - Print out each employee’s pay stub.

### How to Run
1. Compile all Java files in the `Encapsulation/EmployeeTimesheetManager` directory.
2. Run the `Start` class to execute the program.

### Example Output
When you run the program, it will display the total wages for the week and print the pay stubs for each employee.
```
Total wages for this week: 8304.2
Saad     10451 38.54 3083.2
Enoch    10452 35.45 2836.0
praths   10453 20.25 405.0
Fideberg 10454 30.0 1500.0
Chamath  10455 24.0 480.0
```
