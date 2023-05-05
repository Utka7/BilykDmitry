public class ArrayReverser {
    public void reverse(int[] array){
        var start = 0;
        var end = array.length - 1;

        while (start <= end){
            var temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }
}
