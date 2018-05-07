package uz.infiniteloop.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import uz.infiniteloop.didemo.controllers.*;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
       ApplicationContext ctx =  SpringApplication.run(DiDemoApplication.class, args);
        MyController controller = (MyController)ctx.getBean("myController");
        controller.hello();
//        This section is for controllers
        System.out.println(ctx.getBean(ConstructorInjectedController.class).saySomething());
        System.out.println(ctx.getBean(PropertyInjectedController.class).saySomething());
        System.out.println(ctx.getBean(GetterInjectedController.class).saySomething());
        System.out.println(ctx.getBean(PrimaryController.class).saySomething());
        System.out.println(ctx.getBean(YetAnotherController.class).saySomething());

//        This section is for locales
        System.out.println(ctx.getBean(LocaleController.class).greet());
        System.out.println(ctx.getBean(LocaleController.class).pardon());
        System.out.println(ctx.getBean(LocaleController.class).plea());
    }
}
