import java.util.Scanner;

public class Cityname
{
    public static void main( String args[]) {

        String city;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter any Alphabet from a to f : ");
        city = input.next();

        if (city == "a" || city == "A") {
            System.out.print("your city name is Ahmedabad");


        }else if (city == "b" || city == "B") {
            System.out.print("your city name is Bombay");}



            else if (city == "c" || city == "C") {
            System.out.print("your city name is Canada");}


            else if (city == "d" || city == "D") {
            System.out.print("your city name is Dubai");}


            else if (city == "e" || city == "E") {
            System.out.print("your city name is Europe");}

            else if (city == "f" || city == "F") {
            System.out.print("your city name is France");}


            else
            { System.out.println("It is invalid city"); }








    }

}

