import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Q3 {
    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
//        Restaurant teaRestaurant = applicationContext.getBean(Restaurant.class);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("java");
        context.refresh();
        Restaurant restaurant = context.getBean(Restaurant.class);
        restaurant.hotDrink.prepareHotDrink();
        context.close();
        //teaRestaurant.hotDrink.prepareHotDrink();
//        Restaurant expressTeaRestaurant = applicationContext.getBean("expressTeaRestaurant", Restaurant.class);
//        expressTeaRestaurant.hotDrink.prepareHotDrink();
    }
}








