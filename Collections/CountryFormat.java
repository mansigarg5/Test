package Collections;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class CountryFormat {
    public static void main(String[] args) {
        Date d = new Date();
        Locale locale = new Locale("en","US");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locale);
        System.out.println("Default Format: "+d);
        System.out.println("US country format: "+dateFormat.format(d));
    }
}




