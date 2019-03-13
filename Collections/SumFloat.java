package Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SumFloat {
    public static void main(String[] args) {
        float sum = 0.0f;
        List<Float> list = new ArrayList<>();
        list.add(1.1f);
        list.add(2.2f);
        list.add(3.3f);
        list.add(4.4f);
        list.add(5.5f);
        Iterator iterator = list.iterator();
        while(iterator.hasNext())
        {
            float f = (float) iterator.next();
            sum = sum + f;
        }
        System.out.println("The sum is "+sum);
    }
}
