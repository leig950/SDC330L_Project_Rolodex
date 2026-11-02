/*******************************************************************
 * Name: Leighton Jackson
 * Date: 10/24/2026
 * Purpose: Week 3 Project Submission
 * Demonstrates abstraction, constructors,
 * access specifiers, inheritance,
 * composition, interfaces, and polymorphism.
 *******************************************************************/

import java.util.ArrayList;
import java.util.Scanner;

public class App {

        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Contact> contacts =
                new ArrayList<>();

        // Sample Contacts

        contacts.add(
                new Business(
                        1001,
                        "John",
                        "Smith",
                        new Info(
                                "555-1234",
                                "john@company.com"),
                        "ABC Corporation"));

        contacts.add(
                new Family(
                        1002,
                        "Mary",
                        "Jackson",
                        new Info(
                                "555-2222",
                                "mom@email.com"),
                        "Mother"));

        contacts.add(
                new Friend(
                        1003,
                        "Mike",
                        "Brown",
                        new Info(
                                "555-3333",
                                "friend@email.com"),
                        "Mikey"));

        int choice;

        System.out.println("=================================");
        System.out.println("Week 3 Project Submission");
        System.out.println("Rolodex Contact Manager");
        System.out.println("Leighton Jackson");
        System.out.println("=================================\n");

        System.out.println(
                "Welcome to the Rolodex Contact Manager.");

        System.out.println(
                "Create and view contacts using the menu below.\n");

        do {

        System.out.println("\n============== MENU ==============");
        System.out.println("1. Create Contact");
        System.out.println("2. View Business Contacts");
        System.out.println("3. View Family Contacts");
        System.out.println("4. View Friend Contacts");
        System.out.println("5. View All Contacts");
        System.out.println("6. Exit");
        System.out.println("==================================");

        System.out.print("\nEnter Choice: ");

        choice = input.nextInt();
        input.nextLine();

        switch (choice) {

                case 1:

                System.out.println(
                        "\n====== CREATE CONTACT ======");

                System.out.println(
                        "1. Business Contact");

                System.out.println(
                        "2. Family Contact");

                System.out.println(
                        "3. Friend Contact");

                System.out.println(
                        "4. Return To Main Menu");

                System.out.print(
                        "\nEnter Choice: ");

                int type =
                        input.nextInt();

                input.nextLine();

                if (type == 4) {

                        System.out.println(
                                "\nReturning to Main Menu...");

                        break;
                }

                System.out.print(
                        "\nEnter Contact ID: ");

                int id =
                        input.nextInt();

                input.nextLine();

                System.out.print(
                        "Enter First Name: ");

                String firstName =
                        input.nextLine();

                System.out.print(
                        "Enter Last Name: ");

                String lastName =
                        input.nextLine();

                System.out.print(
                        "Enter Phone Number: ");

                String phone =
                        input.nextLine();

                System.out.print(
                        "Enter Email Address: ");

                String email =
                        input.nextLine();

                Info newInfo =
                        new Info(
                                phone,
                                email);

                switch (type) {

                        case 1:

                        System.out.print(
                                "Enter Company Name: ");

                        String company =
                                input.nextLine();

                        contacts.add(
                                new Business(
                                        id,
                                        firstName,
                                        lastName,
                                        newInfo,
                                        company));

                        System.out.println(
                                "\nBusiness Contact Added Successfully.");

                        break;

                        case 2:

                        System.out.print(
                                "Enter Relationship: ");

                        String relationship =
                                input.nextLine();

                        contacts.add(
                                new Family(
                                        id,
                                        firstName,
                                        lastName,
                                        newInfo,
                                        relationship));

                        System.out.println(
                                "\nFamily Contact Added Successfully.");

                        break;

                        case 3:

                        System.out.print(
                                "Enter Nickname: ");

                        String nickname =
                                input.nextLine();

                        contacts.add(
                                new Friend(
                                        id,
                                        firstName,
                                        lastName,
                                        newInfo,
                                        nickname));

                        System.out.println(
                                "\nFriend Contact Added Successfully.");

                        break;

                        default:

                        System.out.println(
                                "\nInvalid Contact Type.");
                }

                        break;

                case 2:

                System.out.println(
                        "\n===== BUSINESS CONTACTS =====");

                for (Contact contact : contacts) {

                        if (contact instanceof Business) {

                        System.out.println(
                                contact.displayInfo());

                        System.out.println(
                                "----------------------");
                        }
                }

                break;

                case 3:

                System.out.println(
                        "\n===== FAMILY CONTACTS =====");

                for (Contact contact : contacts) {

                        if (contact instanceof Family) {

                        System.out.println(
                                contact.displayInfo());

                        System.out.println(
                                "----------------------");
                        }
                }

                break;

                case 4:

                System.out.println(
                        "\n===== FRIEND CONTACTS =====");

                for (Contact contact : contacts) {

                        if (contact instanceof Friend) {

                        System.out.println(
                                contact.displayInfo());

                        System.out.println(
                                "----------------------");
                        }
                }

                break;

                case 5:

                System.out.println(
                        "\n===== ALL CONTACTS =====");

                // POLYMORPHISM
                for (Contact contact : contacts) {

                        System.out.println(
                                contact.displayInfo());

                        System.out.println(
                                "----------------------");
                }

                break;

                case 6:

                System.out.println(
                        "\nThank you for using the Rolodex Contact Manager.");

                System.out.println(
                        "Program terminated.");

                break;

                default:

                System.out.println(
                        "\nInvalid menu option. Please try again.");
        }

        } while (choice != 6);

        input.close();
        }
}