package uz.infiniteloop.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class SayHello implements SaySomething{
    @Override
    public String speak() {
        return "Hello";
    }
}
