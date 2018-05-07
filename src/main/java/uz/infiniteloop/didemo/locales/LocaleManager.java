package uz.infiniteloop.didemo.locales;

import org.springframework.stereotype.Service;

@Service
public interface LocaleManager {
    String greet();

    String pardon();

    String plea();
}
