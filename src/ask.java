import java.util.Scanner;

public class ask{
    public void Ask(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner sc = new Scanner(System.in);
        RegisterUser ru = new RegisterUser();
        loginUserPass lup = new loginUserPass();
        String sagot;
        System.out.println("======================================");
        System.out.println("Welcome to PFB Banking System!");
        System.out.println("Login[1] or Register[2]");
        sagot = sc.nextLine();
            if (sagot.equals("1")){
                lup.login();
            }else if(sagot.equals("2")){
                ru.register();
            }

    }
}
