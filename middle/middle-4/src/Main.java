import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var duplicateFinder = new DuplicateFinder<Integer>();
        var list = Arrays.asList(1, 5, 2, 3, 5, 7, 5);
        var duplicatesMap = duplicateFinder.findDuplicate(list);

        System.out.println(duplicatesMap);
    }
}