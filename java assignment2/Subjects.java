package subjects;
import java.util.Scanner;
public class Subjects {
    public static void main(String[] args) {
        int m1,m2,m3,m4,m5;
        float percentage,sum;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter m1 mark");
       m1=sc.nextInt();
       System.out.println("Enter m2 mark");
       m2=sc.nextInt();
       System.out.println("Enter m3 mark");
       m3=sc.nextInt();
       System.out.println("Enter m4 mark");
       m4=sc.nextInt();
       System.out.println("Enter m5 mark");
       m5=sc.nextInt();
       sum=m1+m2+m3+m4+m5;
       percentage=sum/500*100;
       System.out.println("percentage:"+percentage);
       if(percentage>=90){
           System.out.println("Grade A");
       }
       else if(percentage>=80 && percentage<90){
           System.out.println("Grade B");
       }
       else if(percentage>=70 && percentage<80){
           System.out.println("Grade C");
       }
       else if(percentage>=60 && percentage<70){
           System.out.println("Grade D");
       }
       else if(percentage>=50 && percentage<60){
           System.out.println("Grade E");
       }
       else{
           System.out.println("Fail");
       }
       
    }
    
}
