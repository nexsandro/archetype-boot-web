package boot.web;

import boot.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(value = "/user/{id}")
    public User user(@PathVariable Integer id) {
        return new User("Test", "Test");
    }

}
