import java.util.HashMap;
import java.util.Scanner;

public class RegisterUser
{
    HashMap<String, User> myMap = new HashMap<>();

    public void register()
    {
        Scanner sc = new Scanner(System.in);

        String username, password, answer;

        while(true)
        {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("======================================");

            System.out.print("Create Username: ");
            username = sc.nextLine();

            System.out.print("Create Password: ");
            password = sc.nextLine();

            System.out.print("\033[H\033[2J");
            System.out.flush();
            registerUser(new User(username, password));

            System.out.println("======================================");

            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
            System.out.print("Add This User?(y/n): ");
            answer = sc.nextLine();

            if (answer.equals("Y") || answer.equals("y"))
            {
                break;
            }
        }

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("======================================");

        System.out.println("Account Succesfully Created!");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

    }

    private void registerUser(User username)
    {
        myMap.put(username.getUsername(), username);
    }

    private User getUser(String username)
    {
        return myMap.get(username);
    }
}
