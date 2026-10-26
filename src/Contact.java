/*******************************************************************
 * Name: Leighton Jackson
 * Date: 10/24/2026
 * Purpose: Abstract parent class for all contacts.
 *******************************************************************/
public abstract class Contact
        implements Displayable {

    protected int contactId;
    protected String firstName;
    protected String lastName;
    protected Info info;

    // Default Constructor
    public Contact() {

        contactId = 0;
        firstName = "Unknown";
        lastName = "Unknown";
        info = new Info();
    }

    // Parameterized Constructor
    public Contact(
            int contactId,
            String firstName,
            String lastName,
            Info info) {

        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.info = info;
    }

    public int getContactId() {
        return contactId;
    }

    // ABSTRACT METHOD
    public abstract String displayInfo();
}