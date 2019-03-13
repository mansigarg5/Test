package demo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        configurableApplicationContext.start();
        Demo demo = configurableApplicationContext.getBean("demo", Demo.class);
        demo.display();
        demo.getString();
        configurableApplicationContext.stop();

    }
}
