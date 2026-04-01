import java.util.Scanner;
class InvalidLoginException extends Exception{
    public InvalidLoginException(String message){
        super(message);
    }
}
public class UserAuthentication{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String username, password;

        System.out.print("Enter Username: ");
        username = sc.nextLine();

        System.out.print("Enter Password: ");
        password = sc.nextLine();

        try{
          if (username.equals("admin") && password.equals("1234"))
            System.out.println("login successful ");
          else{
            throw new InvalidLoginException("Invalid Username or Password");
          }
        }
        catch (InvalidLoginException e){
          System.out.println("Exception: " + e.getMessage());
        }
    }
}
