import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,1,2,3,3,3,4,5,5,6,6,6,5,5,1};
        var duplicateRemover = new DuplicateRemover();
        int[] uniqueArray = duplicateRemover.removeDuplicates(array);
        System.out.println(Arrays.toString(uniqueArray));
    }
}