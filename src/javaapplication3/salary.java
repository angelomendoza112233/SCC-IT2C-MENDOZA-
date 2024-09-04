
package javaapplication3;
import java.util.Scanner;
public class salary {
  
    public void getSalary(){

        Scanner input = new Scanner(System.in);
        salaries[] sl = new salaries[100];

        System.out.print("Enter number of Employees: ");
        int numberEmp = input.nextInt();

        for (int x = 0; x < numberEmp; x++) {
            System.out.printf("Details of Employee %d\n", x + 1);

            System.out.print("Employee ID: ");
            int id = input.nextInt();
            input.nextLine();

            System.out.print("Name: ");
            String name = input.nextLine();

            System.out.print("Rate (hourly): ");
            int rate = input.nextInt();

            System.out.print("Hours Worked: ");
            int hours = input.nextInt();

            System.out.print("Total Deduction: ");
            int td = input.nextInt();
            
            sl[x] = new salaries();
            sl[x].employeeData(id, name, rate, hours, td);
        }
        
        for (int x = 0; x < numberEmp; x++) {
            sl[x].viewData();
        }
    
    }
    
}
