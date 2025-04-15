package FullNameGenerator;
import java.util.Scanner;
public class FullNameApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for each part of the name
        System.out.println("Please enter your name");

        System.out.print("First name: ");
        String firstName = input.nextLine().trim();

        System.out.print("Middle name: ");
        String middleName = input.nextLine().trim();

        System.out.print("Last name: ");
        String lastName = input.nextLine().trim();

        System.out.print("Suffix: ");
        String suffix = input.nextLine().trim();

        // Create the full name
        String fullName = firstName;

        if (!middleName.equals("")) {
            fullName = fullName + " " + middleName;
        }

        fullName = fullName + " " + lastName;

        if (!suffix.equals("")) {
            fullName = fullName + ", " + suffix;
        }

        // Show the full name
        System.out.println("Full name: " + fullName);
    }
}
