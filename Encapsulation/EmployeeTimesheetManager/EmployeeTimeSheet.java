package Encapsulation.EmployeeTimesheetManager;

public class EmployeeTimeSheet {
    private String employeeName;
    private int employeeId;
    private double noOfHours;
    private EmployeeType employeetype;

    public EmployeeTimeSheet(String employeeName, int employeeId, double noOfHours, EmployeeType employeetype) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.noOfHours = noOfHours;
        this.employeetype = employeetype;
    }
    public double wageCalculator() {
        return employeetype.getHourlyRate()*noOfHours;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public double getNoOfHours() {
        return noOfHours;
    }
    
}
