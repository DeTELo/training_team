import java.io.Serializable;

public class User implements Serializable {

    private final int id;
    private final String name;
    private final String birthday;

    public User(int id, String name, String birthday) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
    }

    public String toString() {
        return id + " - " + name + " - " + birthday;
    }

    public boolean equals(Object obj) {
        User user = (User) obj;
        return id == user.id;
    }
}