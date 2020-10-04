import java.util.*;
public class login {
        public static void main(String[] args) {
            Scanner user_input = new Scanner(System.in);
            Scanner pass_input = new Scanner(System.in);

            System.out.print("Username --> ");
            String username = user_input.nextLine();

            System.out.print("Password --> ");
            String password = pass_input.nextLine();

            if(username.equals("Isa") && password.equals("Isa")) {
                System.out.print("[SUCCESS]\t Welcome Mr " +username);
            } else {
                String Auth = "Are you authorized?";
                int i = 0;
                while (i < 100) {
                    System.out.println(Auth);
                }
            }
        }
    }
