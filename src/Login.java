import calculator.Read;

import java.util.Scanner;

public class Login {

    public boolean isLoggedIn(){
        Scanner scan = new Scanner(System.in);

        String username="Alin";
        String password="pass";
        System.out.println("Enter username: ");
        String givenUserName = scan.next();
        System.out.println("Enter password: ");
        String givenPassword = scan.next();

        if(username.equals(givenUserName) && password.equals(givenPassword)){
            System.out.println("Login successful");
            return true;
        }else{
            System.out.println("Wrong username or password");
            return false;
        }

    }

    public boolean loginSuccessful(){
        boolean repeat;
        int count = 0;
        do{
            repeat=isLoggedIn();
            count++;
        }while(!repeat && count <3);
        return repeat;
    }
}
