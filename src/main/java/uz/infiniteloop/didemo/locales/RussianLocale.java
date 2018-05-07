package uz.infiniteloop.didemo.locales;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("ru")
public class RussianLocale implements LocaleManager{
    @Override
    public String greet() {
        return "Привет";
    }

    @Override
    public String pardon() {
        return "Прошу прощения";
    }

    @Override
    public String plea() {
        return "Пожалуйста";
    }
}
