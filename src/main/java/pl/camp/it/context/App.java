package pl.camp.it.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.camp.it.context.configuration.AppConfiguration;
import pl.camp.it.context.core.Core;

public class App {
    public static void main(String[] args) {
        ApplicationContext pudeleczko =
                new AnnotationConfigApplicationContext(AppConfiguration.class);
        Core core = pudeleczko.getBean(Core.class);
        core.start();
    }
}
