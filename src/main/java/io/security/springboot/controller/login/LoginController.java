package io.security.springboot.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/denied")
    public String accessDenied() throws Exception{
        return "user/login/denied";
    }
}
