package pri.chaofan.pojo;

public class User {
    private int id;
    private String usernName;
    private String password;

    public User() {
    }

    public User(int id, String usernName, String password) {
        this.id = id;
        this.usernName = usernName;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsernName() {
        return usernName;
    }

    public void setUsernName(String usernName) {
        this.usernName = usernName;
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
                "id=" + id +
                ", usernName='" + usernName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
