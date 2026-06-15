import java.util.Random;
import java.util.Scanner;

public class AccountGenerator
{
    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);
        Random myGen = new Random();
        System.out.print("Enter your first name: ");
        String userFirstName = kbd.nextLine();
        System.out.print("Enter your last name: ");
        String userLastName = kbd.nextLine();

        userFirstName = userFirstName.toLowerCase();
        userLastName = userLastName.toLowerCase();

        char firstLetterOfFirstName = userFirstName.charAt(0);
        String firstFiveOfLastName = userLastName.substring(0,5);

        int myInt = myGen.nextInt(90) + 10;

        String username = firstLetterOfFirstName + firstFiveOfLastName + myInt;
        System.out.println("Username: " + username);

        kbd.close();

    }
}