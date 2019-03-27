import java.util.Scanner;

class Findvalue
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Input any Alphabet , Digit or Symbol : ");
        String line = input.nextLine();

        char c = line.charAt(0);

        if( Character.isDigit(c)) {
            System.out.println(c + " Is a digit");

        }else if (Character.isLetter(c)) {
            System.out.println(c + " Is a Alphabet");

        }else
            System.out.println(c + " is a Symbol");
    }

}