package AccountSystem;

public class AccountForm {

    public int id;
    public String name;
    public int age;
    public String gender;
    private String contact;
    private String address;

    public AccountForm(
            int id,
            String name,
            int age,
            String gender,
            String contact,
            String address
    ) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contact = setContact(contact);
        this.address = address;
    }

    public String setContact(String contact)
    {
        if (String.valueOf(contact).length() == 11)
        {
            return contact;
        }
        else
        {
            return "Invalid Contact";
        }
    }
}
