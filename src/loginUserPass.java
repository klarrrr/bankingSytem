import java.util.Scanner;

public class loginUserPass extends RegisterUser {
    public void login(){
        String username, password;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter your username : ");
        username = sc.nextLine();
        System.out.print("Please enter your password : ");
        password = sc.nextLine();

        User us = new User(username, password);

        if(username.equals(us.getUsername())){
            System.out.println("Correct Username");
        }else{
            System.out.println("Incorrect Username");
        }

        if(password.equals(us.getPassword())){
            System.out.println("Correct Password");
        }
        //boolean pass = myMap.containsKey(password);

        //    if (user == true /*&& pass*/) {
        //        System.out.println("Correct Username");
        //    }else{
        //        System.out.println("Incorrect Username");
        //    }

        //System.out.println(myMap.get(username));
    }
    

}