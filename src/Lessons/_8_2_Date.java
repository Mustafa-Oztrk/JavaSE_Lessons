package Lessons;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class _8_2_Date {
    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis()  );


        Locale locale = new Locale("tr","TR");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss",locale);
        Date date = new Date();
        String trDate = simpleDateFormat.format(date);
        System.out.println(trDate);


    }
}
