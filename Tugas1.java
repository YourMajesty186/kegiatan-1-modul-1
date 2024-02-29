import java.util.Scanner;

public class Tugas1 {
    private static final String Username_Admin = "Admin";
    private static final String Password_Admin = "Noobmaster69";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isLoggedIn = false;

        while (!isLoggedIn) {
            System.out.println("=======LIBRARY SYSTEM=======");
            System.out.println("1. Login as Student: ");
            System.out.println("2. Logim as Admin: ");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3): ");
            int userType = scanner.nextInt();

            switch (userType) {
                case 1:
                    Loginforstudent(scanner);
                    isLoggedIn = true;
                    break;
                case 2:
                    Loginforadmin(scanner);
                    isLoggedIn = true;
                    break;
                case 3:
                    System.out.println("adios");
                    isLoggedIn = true;
                    break;
                default:
                    System.out.println("Option not found");
            }
        }

        scanner.close();
    }


    private static void Loginforstudent(Scanner scanner) {
        System.out.print("Enter Your NIM: ");
        String nim = scanner.next();
        if (nim.length() == 15) {
            System.out.println("Successful login as Student ");
        } else {
            System.out.println("User not found");
        }
    }
    private static void Loginforadmin(Scanner scanner) {
        System.out.print("Enter your username (admin): ");
        String username = scanner.next();
        System.out.print("Enter your password (admin): ");
        String password = scanner.next();

        if (username.equals(Username_Admin) && password.equals(Password_Admin)) {
            System.out.println("Succesful Login as Admin");
        } else {
            System.out.println("Admin User Not Found!!!");
        }
    }
}