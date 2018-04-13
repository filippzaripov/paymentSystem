package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import service.HelloWorldService;

@Controller
public class MainController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping("/")
    public String hello(Model model, String name) {
        model.addAttribute("name", name);
        return "hello";
    }

}
