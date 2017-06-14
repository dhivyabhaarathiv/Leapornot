import java.util.*;
public class Leap
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        int year1=year%4;
        int year2=year1%100;
        int year3=year1%400;
        if(year3==0)
        {
        System.out.println(year+" is a leap year");
        }
        else
        {
        System.out.println(year+" is not a leap year");
        }
        }
        }
