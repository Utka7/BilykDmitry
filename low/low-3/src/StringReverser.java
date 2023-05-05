public class StringReverser {
    public String reverse(String string){
        var stringBuilder = new StringBuilder(string);
        return stringBuilder.reverse().toString();
    }
}
