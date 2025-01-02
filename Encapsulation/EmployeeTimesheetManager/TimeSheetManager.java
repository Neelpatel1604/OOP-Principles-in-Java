package Encapsulation.EmployeeTimesheetManager;

public class TimeSheetManager {
   
        private EmployeeTimeSheet[] timeSheetArray = new EmployeeTimeSheet[20];
        private int count = 0;
    
        public void addTimeSheet(EmployeeTimeSheet timeSheet) {
            if (count < timeSheetArray.length) {
                timeSheetArray[count++] = timeSheet;
            }
        }
    
        public double getTotalWagesForThisWeek() {
            double totalWages = 0; 
            for (EmployeeTimeSheet timeSheet : timeSheetArray) {
                if (timeSheet != null) {
                    totalWages += timeSheet.wageCalculator();
                }
            }
            return totalWages;
        }
        
        public void printPayStubs() {
            for (EmployeeTimeSheet timeSheet : timeSheetArray) {
                if (timeSheet != null) {
                    System.out.println(timeSheet.getEmployeeName() + " " +timeSheet.getEmployeeId() + " " +
                    timeSheet.getNoOfHours() + " " +timeSheet.wageCalculator());
                }
            }
        }   
}
