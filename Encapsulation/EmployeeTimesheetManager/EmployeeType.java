package Encapsulation.EmployeeTimesheetManager;

public enum EmployeeType {
    JUNIOR(20), ASSOCIATE(50), SENIOR(80);

    private double hourlyRate;

    private EmployeeType(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }
}
