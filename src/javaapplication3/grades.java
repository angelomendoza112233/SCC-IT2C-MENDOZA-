
package javaapplication3;

import java.util.Scanner;

public class grades {
    
    public void getGrade(){
    
            grade[] gn = new grade[100];
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter no. of Students: ");
        int nums  = sc.nextInt();
       
       
       
        for(int i=0; i < nums; i++){
            System.out.println("Enter details of student " + (i+1)+":");
            System.out.println("ID:");
            int id = sc.nextInt();
            System.out.println("Name: ");
            String name = sc.next();
            System.out.println("Prelim ");
            double pr = sc.nextDouble();
            System.out.println("Midtern ");
            double md = sc.nextDouble();
            System.out.println("Pre Final ");
            double pf = sc.nextDouble();
            System.out.println("Final ");
            double f = sc.nextDouble();
            gn[i] = new grade();
            gn[i].addGrades(id, name, pr, md, pf, f);
        }
       
        for(int i=0; i < nums; i++){
            gn[i].viewGrade();
           
        }
    
    }
    
}
