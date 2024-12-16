package Lessons;

import java.util.Random;
import java.util.UUID;

public class _3_Random {
    public static void main(String[] args) {
        Random random = new Random();
        int ran = random.nextInt(3,100);
        System.out.println(ran);


        String str = UUID.randomUUID().toString();
        System.out.println(str);
    }
}
