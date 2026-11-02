/*******************************************************************
 * Name: Leighton Jackson
 * Date: 10/24/2026
 * Purpose: Stores phone and email information.
 *******************************************************************/
public class Info {

    private String phone;
    private String email;

    // Default Constructor
    public Info() {

        phone = "Not Provided";
        email = "Not Provided";
    }

    // Parameterized Constructor
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
}