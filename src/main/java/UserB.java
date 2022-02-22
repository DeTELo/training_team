import java.io.Serializable;

public class UserB implements Serializable {

    private final String birthday;

    public UserB(String birthday) {
        this.birthday = birthday;
    }

    public String toString() {
        return birthday;
    }

}
