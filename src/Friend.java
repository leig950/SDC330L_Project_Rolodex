/*******************************************************************
 * Name: Leighton Jackson
 * Date: 10/11/2026
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
}