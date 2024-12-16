package Lessons;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class _8_Calendar_3 {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.getTime());
        System.out.println("Dakika : " + calendar.getTime().getMinutes());
        System.out.println("Saat : " + calendar.getTime().getHours());

        Locale locale = new Locale("tr","TR");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss zzzz",locale);
        Calendar calendar1 = Calendar.getInstance();
        String trStr = simpleDateFormat.format(calendar1.getTime());
        System.out.println(trStr);


        // Ileri Zaman Atama
        calendar1.add(Calendar.HOUR,6);
        System.out.println(calendar1.getTime());
    }
}
