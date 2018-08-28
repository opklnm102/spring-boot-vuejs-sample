package me.dong.springbootbackend;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by ethan.kim on 2018. 8. 28..
 */
@NoArgsConstructor
@Getter
@Setter
public class UserVO {

    private String name;

    private String phoneNumber;

    public UserVO(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}
