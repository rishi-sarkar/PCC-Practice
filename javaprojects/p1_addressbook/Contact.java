package javaprojects.p1_addressbook;

public class Contact {
    private final String name;
    private final String phone;
    private final String email;
    //Constructor
    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String display_info() {
        return "Name: " + name + ", Phone: " + phone + ", Email: " + email;
    }
}
