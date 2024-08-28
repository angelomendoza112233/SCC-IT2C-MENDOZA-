
package javaapplication3;
import java.text.DecimalFormat;
import java.util.Scanner;


public class netPay {
    public void getpay(){
        Scanner input = new Scanner(System.in);
        DecimalFormat si =new DecimalFormat(" ₱#,###.00");
        String name;
        double r,h,d,a;
        System.out.print("enter you name ");
        name=input.nextLine();
        System.out.print("enter age:");
        a=input.nextInt();
        System.out.print("enter rate per hour");
        r=input.nextInt();
        System.out.print("enter hours work");
        h=input.nextInt();
        System.out.print("enter deduction");
        d=input.nextInt();
        
        System.out.println("--------------------------------");
        System.out.println("SLIP DATE ");
        System.out.println("--------------------------------");
        System.out.println("date: august 14, 2024");
        System.out.println("name: "+name);
        System.out.println("age"+a);
        double tg =(r*h);
        System.out.println("total gross "+si.format(tg));
        System.out.println("total deduction: "+si.format(d));
        System.out.println("---------------------------------------");
        System.out.println("total decuction "+si.format(tg-d) );
        System.out.println("---------------------------------------");
    
    }
    
    
}
