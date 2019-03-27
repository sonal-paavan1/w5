import java.util.Scanner;

public class Leapyear
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = s.nextInt();

        if ((year % 4 == 0) || (year % 400 == 0))
        {
            System.out.println(year+ " Is a leap year");
        }
        else
        {
            System.out.println(year+ " Is not leap year");
        }

    }
}


