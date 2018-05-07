package uz.infiniteloop.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import uz.infiniteloop.didemo.services.SaySomething;

@Controller
public class YetAnotherController {
    @Autowired
    private SaySomething saySomething;

    public YetAnotherController(SaySomething saySomething) {
        this.saySomething = saySomething;
    }
    public String saySomething(){
        return saySomething.speak();
    }
}
