package me.dong.springbootbackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ethan.kim on 2018. 8. 28..
 */
@RestController
@RequestMapping(path = "/api/users")
public class UserController {

    private List<UserVO> users;

    public UserController() {
        users = new ArrayList<>();
        users.add(new UserVO("테스터", "010-1111-2222"));
        users.add(new UserVO("테스터", "010-4444-2222"));
        users.add(new UserVO("테스터", "010-9999-1111"));
    }

    @GetMapping
    public ResponseVO<List<UserVO>> getUsers() {
        return ResponseVO.newInstance(users);
    }

    @GetMapping(path = "/{user_id}")
    public ResponseVO<UserVO> getUser(@PathVariable(name = "user_id") int userId) {
        return ResponseVO.newInstance(users.get(userId));
    }
}
