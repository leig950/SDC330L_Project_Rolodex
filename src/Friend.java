/*******************************************************************
 * Name: Leighton Jackson
 * Date: 10/16/2026
 * Purpose: Friend contact.
 *
 * Demonstrates inheritance from Contact.
 *******************************************************************/

public class Friend extends Contact {

    private String nickname;

    public Friend(String firstName,
                  String lastName,
                  Info info,
                  String nickname) {

        super(
            firstName,
            lastName,
            info);

        this.nickname = nickname;
    }

    @Override
    public String toString() {

        return super.toString()
                + "\nNickname: "
                + nickname;
    }
    @Override
    public String displayInfo() {
        return "Friend Contact\n"
                + super.toString()
                + "\nNickname: "
                + nickname;
    }
}