package Lessons;

import java.util.Date;

public class _8_Date {
    public static void main(String[] args) {
        // Anlık tarih ve saati verir
        Date date = new Date();
        System.out.println(date);

        // Günler pazar: 0 pazartesi: 1
        System.out.println("Hafta gün " + date.getDay());

        // Aylar ocak:0 şubat:1
        System.out.println("Ay :" + date.getMonth());

        // yıl:1900
        System.out.println("Yıl: " + (1900+date.getYear()));

        // Saat
        System.out.println("Saat: " + date.getHours());
        System.out.println("Dakika: " + date.getMinutes());
        System.out.println("Saniye: " + date.getSeconds());

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(date.getHours()).append(":").append(date.getMinutes()).append(":").append(date.getSeconds());
        String toStr = stringBuilder.toString();
        System.out.println(toStr);

        // Tarih Saati değiştirme

        date.setTime(22);
        date.setHours(18);
        date.setYear(2003);
    }
}
