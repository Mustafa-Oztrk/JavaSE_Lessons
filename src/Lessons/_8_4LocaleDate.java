package Lessons;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _8_4LocaleDate {
    public static void main(String[] args) {
        // Tarih veriyor
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        // Saat veriyor
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        // Tarih & Saat Veriyor
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }
}
