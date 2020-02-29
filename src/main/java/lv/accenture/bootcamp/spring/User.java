package lv.accenture.bootcamp.spring;

public class User {

    private String fullname;
    private String number;
    private String email;

    public User(String fullname, String number, String email) {
        this.fullname = fullname;
        this.number = number;
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public String getNumber() {
        return number;
    }

    public String getEmail() {
        return email;
    }

}
