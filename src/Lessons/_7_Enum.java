package Lessons;

public class _7_Enum {
    //ENUM
    enum Days{
        PAZARTESİ,SALI,ÇARŞAMBA,PERŞEMBE,CUMA,CUMARTESİ,PAZAR
    }


    public static void main(String[] args) {
        Days days = Days.PAZARTESİ;
        System.out.println(days);

        String data = Days.PAZARTESİ.toString();
        System.out.println(data);

        // Sıra öğrenme
        Days.PAZAR.ordinal();

        System.out.println("\n*********");
        for (Days temp : Days.values()){
            System.out.println(temp + " ");
        }
    }
}
