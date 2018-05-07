package uz.infiniteloop.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import uz.infiniteloop.didemo.services.SaySomething;
@Controller
public class GetterInjectedController {
    private SaySomething saySomething;
    public String saySomething(){
        return  saySomething.speak();
    }
    @Autowired
    @Qualifier("sayGoodBye")
    public void setSaySomething(SaySomething saySomething) {
        this.saySomething = saySomething;
    }
}
