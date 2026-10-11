/*******************************************************************
 * Name: Leighton Jackson
 * Date: 10/11/2026
 * Purpose: Business contact.
 *
 * Demonstrates inheritance from Contact.
 *******************************************************************/

public class Business extends Contact {

    private String company;

    public Business(String firstName,
                    String lastName,
                    Info info,
                    String company) {

        super(
            firstName,
            lastName,
            info);

        this.company = company;
    }

    @Override
    public String toString() {

        return super.toString()
                + "\nCompany: "
                + company;
    }
}