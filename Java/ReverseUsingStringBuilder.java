public class ReverseUsingStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Saurav");
        for (int i = 0; i < sb.length() / 2; i++) {
            char frontChar = sb.charAt(i);
            char backChar = sb.charAt(sb.length() - i - 1);
            sb.setCharAt(i, backChar);
            sb.setCharAt(sb.length() - 1 - i, frontChar);
        }
        System.out.println(sb);
    }
}
