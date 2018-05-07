package uz.infiniteloop.didemo.locales;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("en")
public class EnglishLocale implements LocaleManager{
    @Override
    public String greet() {
        return "Hello";
    }

    @Override
    public String pardon() {
        return "I am sorry";
    }

    @Override
    public String plea() {
        return "Please!";
    }
}
