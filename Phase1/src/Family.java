/*******************************************************************
 * Name: Leighton Jackson
 * Date: 10/24/2026
 * Purpose: Represents a family contact.
 *******************************************************************/
public class Family extends Contact {

    private String relationship;

    public Family() {

        super();
        relationship = "Unknown";
    }

    public Family(
            int contactId,
            String firstName,
            String lastName,
            Info info,
            String relationship) {

        super(contactId,
            firstName,
            lastName,
            info);

        this.relationship = relationship;
    }

    @Override
    public String displayInfo() {

        return "FAMILY CONTACT\n"
                + "ID: " + contactId
                + "\nName: " + firstName + " " + lastName
                + "\nPhone: " + info.getPhone()
                + "\nEmail: " + info.getEmail()
                + "\nRelationship: " + relationship;
    }
}