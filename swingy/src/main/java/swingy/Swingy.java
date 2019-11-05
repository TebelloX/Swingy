package swingy;
import java.util.Scanner;
public class Swingy
{
  public static void main (String[]args)
  {

    //String option = args[0].toString();
    //System.out.println("xxx");
    //Scanner myLimit = new Scanner (System.in);

    //System.out.println ("Which version do you want to play?");
    //System.out.println (option);

    //int option = myLimit.nextInt();

    // while (true)
    // {
      try{

        if (args[0].equals("console")) {
          System.out.println ("Be consoled young one, it's about to go down");
          // break;
        } else if (args[0].equals("gui")) {
            System.out.println("Enter the world of graphics");
            // break;
        }
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Please try again later with valid input");
        // break;
      }
    // }
  }
}