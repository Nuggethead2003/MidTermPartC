package midtermexam_versiona_extensioncode;
import java.util.Scanner;
public class TestUserprofile{
    public static void main(String[] args) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = INPUT.nextLine();
        System.out.println("Please enter your favourite genre. Options are: \n" + 
        "1. Comedy\n" + 
        "2. Drama\n"  + 
        "3. Action\n" +
        "4. Mystery\n");
        String genre = INPUT.nextLine();
        UserProfile profile = new UserProfile(name, genre);
        System.out.println("User profile has been created!");
    }
}