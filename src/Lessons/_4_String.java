package Lessons;

public class _4_String {
    public static void main(String[] args) {
        String str = "JAVA Ogreniyorum";

        // Hepsi Büyük
        System.out.println(str.toUpperCase());

        // Hepsi Küçük
        System.out.println(str.toLowerCase());

        // Uzunluk Bulma
        System.out.println(str.length());

        // Baştaki ve sonraki boşluk silme
        System.out.println(str.trim().length());

        // Soldan arama
        System.out.println(str.indexOf("JAVA"));

        // Sağdan arama
        System.out.println(str.lastIndexOf("JAVA"));

        // Sonuna yazı ekleme
        System.out.println(str.concat("Java"));

        // Verilen index değerindeki veriyi getir
        System.out.println(str.trim().charAt(1));

        // Verilen aralıktaki verileri alır  0 ila 3 dediğimzde 0 dahil 3 dahil değil
        System.out.println(str.substring(0,3)); //Çıktısı JAV

        // Metin içinde değer aramaya yarar varsa true yoksa false döndürür
        System.out.println(str.contains("JAVA"));

        // Başlangıç değerini gorgulama
        System.out.println(str.startsWith("JAVA"));

        // Bitiş değerini sorgulama
        System.out.println(str.endsWith("m"));

        // Eşitmi
        System.out.println(str.equals("JAVA"));

        // VEriyi değiştirme
        System.out.println(str.replace(str,"JAVA Ogrenmiyorum"));

        // VErilen değere göre parçalama
        String[] aldata = str.split(" ");
    }
}
