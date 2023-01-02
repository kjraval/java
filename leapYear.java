import java.util.Scanner;

public class leapYear {
 
 public static void main(String args[]){


    Scanner scan = new Scanner(System.in);

    System.out.print("enter year to check ");
    int year = scan.nextInt();

    if(((year % 4==0) && (year % 100!=0)) || (year % 400==0)){
        System.out.println("LEAP YEAR");
        }
        else{
        System.out.println("COMMON YEAR");
        } 
       


        scan.close();
 }   




}
