/*******************************************************************
 * Name: Leighton Jackson
 * Date: 10/16/2026
 * Purpose: Week 2 Project Demo
 *******************************************************************/

public class App {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("Week 2 Project Submission");
        System.out.println("Rolodex Contact Manager");
        System.out.println("Leighton Jackson");
        System.out.println("=================================\n");

        System.out.println(
            "Welcome to the Rolodex Contact Manager.");

        System.out.println(
            "This demonstration shows interfaces and polymorphism.\n");

        Business business =
            new Business(
                "John",
                "Smith",
                new Info(
                    "555-1234",
                    "john@company.com"),
                "ABC Corporation");

        Family family =
            new Family(
                "Mary",
                "Jackson",
                new Info(
                    "555-2222",
                    "mom@email.com"),
                "Mother");

        Friend friend =
            new Friend(
                "Mike",
                "Brown",
                new Info(
                    "555-3333",
                    "friend@email.com"),
                "Mikey");

        // POLYMORPHISM
        Contact[] contacts = {
            business,
            family,
            friend
        };

        System.out.println(
            "Polymorphism Demonstration\n");

        for(Contact c : contacts) {

            System.out.println(
                c.displayInfo());

            System.out.println(
                "------------------");
        }
    }
}