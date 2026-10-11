/*******************************************************************
 * Name: Leighton Jackson
 * Date: 10/11/2026
 * Purpose: Week 1 Rolodex Project Demo
 *******************************************************************/

public class App {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("Week 1 Project Submission");
        System.out.println("Rolodex Contact Manager");
        System.out.println("Leighton Jackson");
        System.out.println("=================================\n");

        System.out.println(
            "Welcome to the Rolodex Contact Manager.");

        System.out.println(
            "This Week 1 demonstration shows inheritance and composition.\n");

        Info businessInfo =
                new Info(
                    "555-1234",
                    "john@company.com");

        Info familyInfo =
                new Info(
                    "555-2222",
                    "mom@email.com");

        Info friendInfo =
                new Info(
                    "555-3333",
                    "friend@email.com");

        Business business =
                new Business(
                    "John",
                    "Smith",
                    businessInfo,
                    "ABC Corporation");

        Family family =
                new Family(
                    "Mary",
                    "Jackson",
                    familyInfo,
                    "Mother");

        Friend friend =
                new Friend(
                    "Mike",
                    "Brown",
                    friendInfo,
                    "Mikey");

        System.out.println("BUSINESS CONTACT");
        System.out.println("----------------");
        System.out.println(business);

        System.out.println("\nFAMILY CONTACT");
        System.out.println("--------------");
        System.out.println(family);

        System.out.println("\nFRIEND CONTACT");
        System.out.println("--------------");
        System.out.println(friend);

        System.out.println("\nInheritance Demonstration:");
        System.out.println(
            "Business, Family, and Friend inherit from Contact.");

        System.out.println("\nComposition Demonstration:");
        System.out.println(
            "Contact contains an Info object.");
    }
}