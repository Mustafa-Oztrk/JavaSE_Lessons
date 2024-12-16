package Lessons;

import java.util.Random;

public class _2_Math {
    public static void main(String[] args) {

        // iki sayı arasındaki en büyük
        System.out.println(Math.max(100,999));

        // iki sayı arasındaki en küçük
        System.out.println(Math.min(100,999));

        //PI sayısını verir
        System.out.println(Math.PI);

        // Karekök bulma
        System.out.println(Math.sqrt(25));

        // mutlak değer bulma
        System.out.println(Math.abs(-25));

        // Sayıyı aşağı yuvarlama
        System.out.println(Math.floor(3.9)); // 3.0

        // her zaman yukarı
        System.out.println(Math.ceil(3.1)); // 4

        // ayı 0.5 den yukarı ise yukarı 0.5 den aşağı ise aşağı yuvarlar
        System.out.println(Math.round(5.4));

        Random ran = new Random(100);

    }
}
