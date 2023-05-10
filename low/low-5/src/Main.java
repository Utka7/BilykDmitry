import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8};
        var arrayReverser = new ArrayReverser();
        arrayReverser.reverse(array);
        System.out.println(Arrays.toString(array));
    }
}