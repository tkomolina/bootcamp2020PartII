package lv.accenture.bootcamp.network;

public class EffectiveString {

    public static void main(String[] args) {
        String s = "";
        s += "Hello";
        s += " ";
        s += "world";
        s += "!"; // nav efektiva pieeja, jo visi starprezultati glabajas atmina, kau ari pieeja tiem pazud
        System.out.println(s);

        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("world");
        sb.append("!");
        String s2 = sb.toString();
        System.out.println(s2);
    }
}
