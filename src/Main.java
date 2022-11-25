import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username , password ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter username :");
        username = input.next();
        System.out.println("Enter password :");
        password = input.next();
        if (username.equals("java101") && password.equals("123")) {
            System.out.print("Successfully entered!");
        }else if(username.equals("java101")||password.equals(false)){
            System.out.print("password incorrect");
        } else if (username.equals(false)||password.equals("123")) {
            System.out.print("username incorrect");

        }else{
            System.out.print("username and password incorrect");
        }
    }
}