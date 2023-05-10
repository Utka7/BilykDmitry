public class ArrayReverser {
    public void reverse(int[] array){

        for (int i = 0, j = array.length-1; i < array.length / 2; i++, j--){
            array[i] ^= array[j];
            array[j] ^= array[i];
            array[i] ^= array[j];
        }
    }
}
