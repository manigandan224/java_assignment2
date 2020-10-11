package employee1;
import java.util.*;
public class Employee1 {
    String ename;
     int dateofbirth,monthofbirth,yearofbirth;
     double monthlysalary,taxamount;
     public void getdata(){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the employee name");
     ename=sc.next();
     System.out.println("Enter the dateofbirth:");
     dateofbirth=sc.nextInt();
     System.out.println("Enter the monthofbirth:");
     monthofbirth=sc.nextInt();
     System.out.println("Enter the yearofbirth:");
     yearofbirth=sc.nextInt();
     System.out.println("Enter the monthlysalary:");
     monthlysalary=sc.nextDouble();
     }
    public void display(){
        System.out.println("Employee name:"+ename);
        System.out.println("DateOfBirth:"+dateofbirth);
        System.out.println("MonthOfBirth:"+monthofbirth);
        System.out.println("YearOfBirth:"+yearofbirth);
        System.out.println("MonthlySalary:"+monthlysalary);
        if(monthlysalary==500000){
            taxamount=500000*0.2;
            System.out.println("taxamount:"+taxamount);
        }
        else if(monthlysalary==400000){
            taxamount=400000*0.15;
            System.out.println("taxamount:"+taxamount);
        }
        else if(monthlysalary==300000){
            taxamount=300000*0.1;
            System.out.println("taxamount:"+taxamount);
        }
        else if(monthlysalary==200000){
            taxamount=200000*0.05;
            System.out.println("taxamount:"+taxamount);
        }
        else{
            System.out.println("Invalid amount");
        }
    }
    public static void main(String[] args) { 
     Employee1 e=new Employee1();
     e.getdata();
     e.display();
    }
    
}
