package javaapplication3;

public class salaries {

    private int id, rate, hours, td;
    private String name;

    // Method to set employee data
    public void employeeData(int eid, String ename, int erate, int ehours, int etd) {
        this.id = eid;
        this.name = ename;
        this.rate = erate;
        this.hours = ehours;
        this.td = etd;
    }


    public void viewData() {
        double gross = this.rate * this.hours;
        double netPay = gross - this.td;


        System.out.println("-------------------------------------------------------------------------------");
        System.out.printf("%-15s %-15s %-15s %-20s %-10s %-15s %-10s%n", 
                          "Employee ID","Name", "Rate (Hourly)", "Total Hours Worked", "Gross", "Total Deduction", "Net Pay");
        System.out.println("-------------------------------------------------------------------------------");

        System.out.printf("%-15d %-15s %-15d %-20d %-10.2f %-15d %-10.2f%n", 
           this.id, this.name, this.rate, this.hours, gross, this.td, netPay);
    }
}
