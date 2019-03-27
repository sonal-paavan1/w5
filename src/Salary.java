import java.util.Scanner;

public class Salary{


    public static void main( String arg []){

        int emp;
        String name;
        double bs,hra, ta, da, pf, gs;

        Scanner input = new Scanner( System.in);

        System.out.print("Enter your Emp ID : ");
        emp = input.nextInt();

        System.out.print("Enter your Name : ");
        name = input.next();

        System.out.print("Enter your Basic salary : ");
        bs = input.nextDouble();

        hra =  (bs*10) / 100;
        ta = (bs*8) / 100;
        da = (bs*9) /100;
        pf = (bs*20) / 100;

        gs = (bs+hra+ta+da) - (pf);

        System.out.println("HRA = " +hra);
        System.out.println("TA = " +ta);
        System.out.println("DA = " +da);
        System.out.println("PF = " +pf);
        System.out.println(name+ " Your Gross Salary  = " +gs);
    }

}
