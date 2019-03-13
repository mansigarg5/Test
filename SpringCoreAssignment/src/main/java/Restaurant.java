import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {
    @Autowired
    HotDrink hotDrink;
    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }
}

