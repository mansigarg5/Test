package Java2;

import java.util.concurrent.TimeUnit;

public class ConvertSeconds {
    public static void main(String [] args){
        long s = 86400L;
        System.out.println("Time in seconds: "+s);
        System.out.println("Time in days: "+TimeUnit.SECONDS.toDays(s));
        System.out.println("Time in hours: "+TimeUnit.SECONDS.toHours(s));
        System.out.println("Time in minutes: "+TimeUnit.SECONDS.toMinutes(s));
    }
}

