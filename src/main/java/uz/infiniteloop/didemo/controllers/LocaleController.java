package uz.infiniteloop.didemo.controllers;

import org.springframework.stereotype.Controller;
import uz.infiniteloop.didemo.locales.LocaleManager;
@Controller
public class LocaleController {
    private LocaleManager localeManager;

    public LocaleController(LocaleManager localeManager) {
        this.localeManager = localeManager;
    }
    public String greet(){
        return localeManager.greet();
    }
    public String pardon(){
        return localeManager.pardon();
    }
    public String plea(){
        return localeManager.plea();
    }
}
