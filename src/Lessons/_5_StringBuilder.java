package Lessons;

public class _5_StringBuilder {
    public static void main(String[] args) {
        //Strngbuiler
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Mustafa ").append(" Java ").append(" Seviyor");
        String toChange = stringBuilder.toString();
        System.out.println(toChange);

    }
}
