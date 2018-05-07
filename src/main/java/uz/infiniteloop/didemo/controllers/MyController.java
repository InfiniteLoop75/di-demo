package uz.infiniteloop.didemo.controllers;

import org.springframework.stereotype.Controller;
import uz.infiniteloop.didemo.services.SaySomething;

@Controller
public class MyController  {
    public String hello(){
        System.out.println("Hello ");
        return "";
    }


}
