/*******************************************************************
 * Name: Leighton Jackson
 * Date: 10/24/2026
 * Purpose: Represents a business contact.
 *******************************************************************/
public class Business extends Contact {

    private String company;

    public Business() {

        super();
        company = "Unknown Company";
    }

    public Business(
            int contactId,
            String firstName,
            String lastName,
            Info info,
            String company) {

        super(contactId,
            firstName,
            lastName,
            info);

        this.company = company;
    }

    @Override
    public String displayInfo() {

        return "BUSINESS CONTACT\n"
                + "ID: " + contactId
                + "\nName: " + firstName + " " + lastName
                + "\nPhone: " + info.getPhone()
                + "\nEmail: " + info.getEmail()
                + "\nCompany: " + company;
    }
}