import java.util.Scanner;

public class Planets
{
    enum planets {MERCURY, VENUS, EARTH, MARS, JUPITER, SATURN, URANUS, NEPTUNE}; //Not Pluto
    
    public static void main(String[]args)
    {
        String wordsOfPluto("I am a planet");
        Scanner kybrd = new Scanner(System.in);
        String input = "";

    
        while(!input.equalsIgnoreCase("Quit"))
        {
            System.out.print("Name a planet (Quit to Quit): ");
            input = kybrd.nextLine();

            try
            {
                System.out.println("That planet is in position " + (planets.valueOf(input.toUpperCase()).ordinal()+1) + " of the solar system.");
            }
            catch(IllegalArgumentException e)
            {
                System.out.println("Invalid Planet");
            }

            System.out.println();
        }
    }
}
