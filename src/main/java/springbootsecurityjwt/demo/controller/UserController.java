package springbootsecurityjwt.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangkang
 * @date 2019-03-03 下午 09:30
 **/
@RestController
public class UserController {
    @RequestMapping("/hello")
    public String hello() {
        return "helloSSO";
    }

    @PreAuthorize("hasAnyAuthority('ROLE_ADMIN')")
    @RequestMapping("/test")
    public String test() {
        return "test";
    }

    @PreAuthorize("hasAnyAuthority('ROLE_USER')")
    @RequestMapping("/test1")
    public String test1() {
        return "test1";
    }
}
