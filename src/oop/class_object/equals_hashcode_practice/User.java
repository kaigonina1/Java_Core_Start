package oop.class_object.equals_hashcode_practice;

public class User {
    String login;
    String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)return false;
        if (obj instanceof User){
            User user2 = (User) obj;
            if (this.login.equals(user2.getLogin()) == true && this.password.equals(user2.getPassword())==true) return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.login.hashCode();
    }
}
