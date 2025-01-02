package Encapsulation.EmployeeTimesheetManager;
public class Start {
    public static void main(String[] args) {
        TimeSheetManager manager = new TimeSheetManager();

        EmployeeTimeSheet e1 = new EmployeeTimeSheet("Saad    ", 10451, 38.54, EmployeeType.SENIOR);
        EmployeeTimeSheet e2 = new EmployeeTimeSheet("Enoch   ", 10452, 35.45, EmployeeType.SENIOR);
        EmployeeTimeSheet e3 = new EmployeeTimeSheet("praths  ", 10453, 20.25, EmployeeType.JUNIOR);
        EmployeeTimeSheet e4 = new EmployeeTimeSheet("Fideberg", 10454, 30, EmployeeType.ASSOCIATE);
        EmployeeTimeSheet e5 = new EmployeeTimeSheet("Chamath ", 10455, 24, EmployeeType.JUNIOR);

        manager.addTimeSheet(e1);
        manager.addTimeSheet(e2);
        manager.addTimeSheet(e3);
        manager.addTimeSheet(e4);
        manager.addTimeSheet(e5);

        System.out.println("Total wages for this week: " + manager.getTotalWagesForThisWeek());
        manager.printPayStubs();
    }
}