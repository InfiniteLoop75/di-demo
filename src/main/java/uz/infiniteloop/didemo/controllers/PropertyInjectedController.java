package uz.infiniteloop.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import uz.infiniteloop.didemo.services.SayGoodBye;
import uz.infiniteloop.didemo.services.SayHello;
import uz.infiniteloop.didemo.services.SaySomething;

@Controller
public class PropertyInjectedController {
    //Worst Practice
    @Autowired
    @Qualifier("sayGoodBye")
    private SaySomething saySomething;


    public String saySomething(){
        return saySomething.speak();
    }
}
