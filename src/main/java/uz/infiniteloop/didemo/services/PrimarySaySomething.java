package uz.infiniteloop.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimarySaySomething implements SaySomething{

    @Override
    public String speak() {
        return "This is primary say something";
    }
}
