import models.Auto;
import models.User;
import services.UserService;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        User zhliga = new User("Zhliga", 26);
        userService.saveUser(zhliga);
        Auto audiQ3 = new Auto("Audi Q3", "red");
        audiQ3.setUser(zhliga);
        zhliga.addAuto(audiQ3);
        Auto ford = new Auto("Ford", "black");
        ford.setUser(zhliga);
        zhliga.addAuto(ford);

        userService.updateUser(zhliga);
    }

}
