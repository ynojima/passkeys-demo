package net.sharplab.demo.passkeys.app.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/")
public class DemoController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

}
