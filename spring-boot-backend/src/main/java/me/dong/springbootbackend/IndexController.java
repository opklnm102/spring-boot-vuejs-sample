package me.dong.springbootbackend;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by ethan.kim on 2018. 8. 28..
 */
@Controller
public class IndexController implements ErrorController {

    @GetMapping(path = {"/", "/error"})
    public String index() {
        return "index";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
