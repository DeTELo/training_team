import java.io.Serializable;

public class User implements Serializable {

    private final int id;
    private final String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name;
    }

    public boolean equals(Object obj) {
        User user = (User) obj;
        return id == user.id;
    }
}