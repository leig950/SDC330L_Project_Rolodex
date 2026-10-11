/*******************************************************************
 * Name: Leighton Jackson
 * Date: 10/11/2026
 * Purpose: Family contact.
 *
 * Demonstrates inheritance from Contact.
 *******************************************************************/

public class Family extends Contact {

    private String relationship;

    public Family(String firstName,
                  String lastName,
                  Info info,
                  String relationship) {

        super(
            firstName,
            lastName,
            info);

        this.relationship = relationship;
    }

    @Override
    public String toString() {

        return super.toString()
                + "\nRelationship: "
                + relationship;
    }
}