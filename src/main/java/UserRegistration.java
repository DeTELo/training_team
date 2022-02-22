import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class UserRegistration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Registration");
        System.out.print("Username: ");
        User user1 = new User((int) ( Math.random() * 3 ),scanner.next());
        System.out.print("Birthday: ");
        UserB user2 = new UserB(scanner.next());
        try {
            FileOutputStream fos = new FileOutputStream("main.userReg");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(user1);
            oos.writeObject(user2);

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    }
