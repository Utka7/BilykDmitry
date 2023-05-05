public class StringReverser {
    public String reverse(String string){
        var stringBuilder = new StringBuilder(string.length());
        for (int i = string.length() - 1 ; i >= 0; i--){
            stringBuilder.append(string.charAt(i));
        }
        return stringBuilder.toString();
    }
}
