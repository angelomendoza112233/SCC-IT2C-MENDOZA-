package javaapplication3;

import java.util.Scanner;

public class grades {

    public void editGrades(grade[] grs, int size, int id) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            if (grs[i].id == id) {
                System.out.println("New Prelim Grade: ");
                double prl = sc.nextDouble();
                grs[i].p = prl;
                System.out.println("New Midterm Grade: ");
                double m2 = sc.nextDouble();
                grs[i].m = m2;
                System.out.println("New PreFinal Grade: ");
                double pf1 = sc.nextDouble();
                grs[i].pf = pf1;
                System.out.println("New Final Grade: ");
                double f1 = sc.nextDouble();
                grs[i].f = f1;
            }
        }
    }

    public void getGrade() {

        grade[] gn = new grade[100];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of Students: ");
        int nums = sc.nextInt(); 

        String op;
        
        do {
            

            System.out.println("Welcome to Grading App");
            System.out.println("-------------------------------------");
            System.out.println("1. ADD");
            System.out.println("2. VIEW");
            System.out.println("3. UPDATE");
            System.out.println("4. DELETE");
            System.out.println("5. EXIT");
            System.out.println("-------------------------------------");

            System.out.print("Enter Action: ");
            int option = sc.nextInt();

            while (option > 5 || option < 1) {
                System.out.print("Invalid Action. Try Again: ");
                option = sc.nextInt();
            }

            switch (option) {

                case 1:
                   
                    for (int i = 0; i < nums; i++) {
                        System.out.println("Enter details of student " + (i + 1) + ":");
                        System.out.println("ID:");
                        int id = sc.nextInt();
                        System.out.println("Name: ");
                        String name = sc.next();
                        System.out.println("Prelim: ");
                        double pr = sc.nextDouble();
                        System.out.println("Midterm: ");
                        double md = sc.nextDouble();
                        System.out.println("Pre Final: ");
                        double pf = sc.nextDouble();
                        System.out.println("Final: ");
                        double f = sc.nextDouble();
                        gn[i] = new grade(); 
                        gn[i].addGrades(id, name, pr, md, pf, f);
                    }
                    break;

                case 2:
                    
                    for (int i = 0; i < nums; i++) {
                        gn[i].viewGrade();
                    }
                    break;

                case 3:
                    
                    System.out.println("Enter the ID to update: ");
                    int ids = sc.nextInt();
                    editGrades(gn, nums, ids);
                    break;

                case 4:
                    
                     grade mdl = new grade();
                    System.out.println("Enter the ID to remove: ");
                    ids = sc.nextInt();
                    nums = mdl.removeBook(gn, nums, ids);  
                    break;

                case 5:
                    
                    System.out.println("Exiting the application.");
                    return; 
            }

            System.out.println("Do you want to continue?(Y/N): ");
            op = sc.next();

        } while (op.equalsIgnoreCase("Y"));
    }
}
