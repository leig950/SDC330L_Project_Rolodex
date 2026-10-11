/*******************************************************************
 * Name: Leighton Jackson
 * Date: 10/11/2026
 * Purpose: Stores contact information.
 *******************************************************************/

public class Info {

    private String phone;
    private String email;

    public Info(String phone, String email) {
        this.phone = phone;
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Phone: " + phone +
               "\nEmail: " + email;
    }
}