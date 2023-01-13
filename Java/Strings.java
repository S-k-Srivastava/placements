public class Strings {
    public static void main(String[] args) {
        String str = new String("hello");
        str = "gello";
        System.out.println(str.equals(str + ""));
    }
}