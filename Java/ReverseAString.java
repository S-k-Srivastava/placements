public class ReverseAString {
    public static void main(String[] args) {
        String str = "Saurav";
        String revStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revStr += str.charAt(i);
        }
        System.out.println(revStr);
    }
}
