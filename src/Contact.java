/*******************************************************************
 * Name: Leighton Jackson
 * Date: 10/11/2026
 * Purpose: Base contact class.
 *
 * Demonstrates composition using Info.
 *******************************************************************/

public class Contact {

    private String firstName;
    private String lastName;

    // COMPOSITION
    private Info info;

    public Contact(String firstName,
                   String lastName,
                   Info info) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.info = info;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Info getInfo() {
        return info;
    }

    @Override
    public String toString() {

        return "Name: "
                + firstName
                + " "
                + lastName
                + "\n"
                + info;
    }
}
