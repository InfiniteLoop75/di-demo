package uz.infiniteloop.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import uz.infiniteloop.didemo.services.SaySomething;
@Controller
public class ConstructorInjectedController {
    private SaySomething saySomething;
    @Autowired
    public ConstructorInjectedController(@Qualifier("sayHello") SaySomething saySomething) {
        this.saySomething = saySomething;
    }
    public String saySomething(){
        return saySomething.speak();
    }
}
