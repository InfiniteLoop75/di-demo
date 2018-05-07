package uz.infiniteloop.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import uz.infiniteloop.didemo.services.SaySomething;

@Controller
public class PrimaryController {
    @Autowired
    private SaySomething saySomething;
    @Primary
    public String saySomething(){
        return saySomething.speak();
    }
}
