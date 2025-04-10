import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        // .substring() = A method used to extract a portion of a string
        // .substring(start, end)

        Scanner scanner = new Scanner(System.in);

        String email = "juanes401890@gmail.com";
        String username = email.substring(0, 12);
        String domain = email.substring(12, 22);

        System.out.println(username);
        System.out.println(domain);

        // When we do it with a different email
        String emailTwo = "jece2006@gmail.com";
        String usernameTwo = email.substring(0, email.indexOf("@"));
        String domainTwo = email.substring(email.indexOf("@") + 1);
        // with the +1 we elimate the @ at the domain.

        System.out.println(emailTwo);
        System.out.println(usernameTwo);
        System.out.println(domainTwo);

        String userEmail;

        System.out.print("Enter your email: ");
        userEmail = scanner.nextLine();

        if (userEmail.contains("@")) {

            username = userEmail.substring(0, userEmail.indexOf("@"));
            domain = userEmail.substring(userEmail.indexOf("@") + 1);

            System.out.println("Your mail is: " + userEmail);
            System.out.println("Your username is: " + username);
            System.out.println(domain);
        } else {
            System.out.println("Enter a valid email");
        }

        scanner.close();
    }
}