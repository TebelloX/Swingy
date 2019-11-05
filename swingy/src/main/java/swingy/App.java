import java.util.Scanner;
public class App
{
  public static void main (String[]args)
  {
    int countIt = 0;
    Scanner myLimit = new Scanner (System.in);

    System.out.println ("What's your limit? ");
    int actualLimit;
    actualLimit = myLimit.nextInt ();
    while (true)
    {
	    countIt++;
	    if (countIt == actualLimit)
	    {
	        System.out.println ("Your hero dies");
	        break;
	    }
    }
  }
}