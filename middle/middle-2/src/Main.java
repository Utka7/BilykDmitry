public class Main {
    public static void main(String[] args) {

        String firstString = "hello";
        String secondString = "oelhl";
        var anagramSearcher = new AnagramSearcher();
        var isAnagram = anagramSearcher.isAnagram(firstString,secondString);
        System.out.println(isAnagram);
    }
}