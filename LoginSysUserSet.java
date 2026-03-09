import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    ा
        System.out.print("Set username: ");
        String username = sc.nextLine();

        System.out.print("Set password: ");
        String password = sc.nextLine();

        String inputUser, inputPass;
        do {
            System.out.print("Enter username: ");
            inputUser = sc.nextLine();

            System.out.print("Enter password: ");
            inputPass = sc.nextLine();

            if(inputUser.equals(username) && inputPass.equals(password)){
                System.out.println("Login Successful");
            } else {
                System.out.println("Invalid username or password. Try again!");
            }
        } while(!inputUser.equals(username) || !inputPass.equals(password));
    }
}
