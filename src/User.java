public class User extends RegisterUser 
{
    String username, password;
    int balance;

    public User(String username, String password, int balance)
    {
        this.username = username;
        this.password = password;
        this.balance = balance;
    }

    public User(String username, String password)
    {
        this.username = username;
        this.password = password;
    }
    
    public void setUsername(String username)
    {
        this.username = username;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public void setBalance(int balance)
    {
        this.balance = balance;
    }
    
    public String getUsername()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
    }

    public int getBalance()
    {
        return balance;
    }

    public void print()
    {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Balance: " + Integer.toString(balance));
    }
}
