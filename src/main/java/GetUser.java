import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class GetUser {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("main.userReg");
            ObjectInputStream ois = new ObjectInputStream(fis);

            User user1 = (User) ois.readObject();
            UserB user2 = (UserB) ois.readObject();

            System.out.println("ID and Name: " + user1);
            System.out.println("Birthday: " + user2);

            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
