import db.MongoDb;
import db.MySqlDb;

public class Client {

    public static void main(String[] args) {
        UserService userService = new UserService(new MySqlDb());
        userService.singUp();
        userService.doTransaction();
    }
}
