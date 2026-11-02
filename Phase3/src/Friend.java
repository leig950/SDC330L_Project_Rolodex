/*******************************************************************
 * Name: Leighton Jackson
 * Date: 10/24/2026
 * Purpose: Represents a friend contact.
 *******************************************************************/
public class Friend extends Contact {

    private String nickname;

    public Friend() {

        super();
        nickname = "Unknown";
    }

    public Friend(
            int contactId,
            String firstName,
            String lastName,
            Info info,
            String nickname) {

        super(contactId,
                firstName,
                lastName,
                info);

        this.nickname = nickname;
    }

    @Override
    public String displayInfo() {

        return "FRIEND CONTACT\n"
                + "ID: " + contactId
                + "\nName: " + firstName + " " + lastName
                + "\nPhone: " + info.getPhone()
                + "\nEmail: " + info.getEmail()
                + "\nNickname: " + nickname;
    }
}