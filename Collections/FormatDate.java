package Collections;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDate {
    public static void main(String[] args) {
        Date d = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMMM-YYYY");
        String date = simpleDateFormat.format(d);
        System.out.println(date);
    }
}
