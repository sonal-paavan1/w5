import java.util.Scanner;

public class Dayname {

    public static void main(String args[]) {

        String daymane = "";
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any day of the week in  digit : ");
        int day = input.nextInt();


        if(day   == 1)
        {
            System.out.println("Today is Monday");
        }
        if(day ==  2)
        {
            System.out.println("Today is Tuesday");
        }
        if(day  == 3)
        {
            System.out.println("Today is Wednesday");
        }
        if(day  ==  4)
        {
            System.out.print("Today is Thursday");
        }
        if(day ==  5)
        {
            System.out.print("Today is Friday");
        }
        if(day  == 6)
        {
            System.out.print("Today is Saturday");

        }
        if(day == 7)
        {
            System.out.println("Today is Sunday");
        }
        if (day > 7)
            System.out.println("Invalid Entry ");



    }
}



