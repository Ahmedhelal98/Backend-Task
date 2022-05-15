package BackentASK.Backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LoginController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/addUser")
    public String saveUser(@RequestBody User userr) {
        userRepository.save(userr);
        return "user added : " + userr.getEmail();
    }

    @GetMapping("/users")
    public String getUserData(@RequestBody User user) {

        List<User> usersData = userRepository.findAll();
        //List<User> users = userRepository.findAll();

        for (User UsersDB : usersData) {
            if (user.getEmail().equals(UsersDB.getEmail())) {
//                System.out.println("User Not Found");
//                return user;

                if (user.getPassword().equals(UsersDB.getPassword())) {

                    System.out.println("Logged In");
                    return "Logged In";

                } else {
                    System.out.println("Incorrect Password");
                    return "Incorrect Password";

                }

            }

        }
        System.out.println("User Not Found");
        return "User Not Found";
    }
}

