package uz.infiniteloop.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class SayGoodBye implements SaySomething{
    @Override
    public String speak() {
        return "Good Bye";
    }
}
