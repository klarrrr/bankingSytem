import java.util.Scanner;
public class Main 
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String answer;
        boolean run = true;
        while(run)
        {
        ask tanong = new ask();
        tanong.Ask();
        System.out.println("Would you like to go back? [y/n]");
        answer = sc.nextLine();
        if (answer.equals("n") || answer.equals("N")){
            run = false;
            }else{
                run=true;
            }
        }
    }
}

