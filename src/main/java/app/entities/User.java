package app.entities;

public class User {
    private String name;
    private String password;

    public User() {
    }


    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) { //возможно нужно переписать
        return super.equals(obj);
    }

    @Override
    public int hashCode() { //возможно нужно переписать
        return super.hashCode();
    }
}
