import java.util.Scanner;

public class Salecommi
{
    public static void main(String args[])
    {
        int id;
        float sam,com=0,ts,bs;
        String name;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your sales ID :");
        id = input.nextInt();

        System.out.print("Enter your Seller Name : ");
        name = input.next();

        System.out.print("Enter your Sales Amount : ");
        sam = input.nextInt();

        System.out.print("Enter your Basic Salary : ");
        bs = input.nextInt();

        if(sam >= 50000)
        { com = (sam*35) / 100;}

        else if (sam>= 30000)
            com = (sam * 20) / 100;

        else if (sam>=20000)
        { com= (sam*10) /100;}


        else if (sam>=10000)
        { com= (sam*05) /100;}

        else if (sam< 10000)
        { com= (sam*02) /100;}

        ts = bs + com;
        System.out.println("your total salary = " +ts);

        }
    }

