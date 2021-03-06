package classes;

public class Person {
    private String name;
    private int age;
    private String login;
    private String password;
    private String status;

    public Person(String name, int age, String login, String password, String status) {
        this.name = name;
        this.age = age;
        this.login = login;
        this.password = password;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
