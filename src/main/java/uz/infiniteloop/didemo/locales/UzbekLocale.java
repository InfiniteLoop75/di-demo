package uz.infiniteloop.didemo.locales;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"uz", "default"})
public class UzbekLocale implements LocaleManager{

    @Override
    public String greet() {
        return "Salom";
    }

    @Override
    public String pardon() {
        return "Kechirasiz";
    }

    @Override
    public String plea() {
        return "Iltimos";
    }
}
