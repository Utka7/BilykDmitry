public class Searcher {
    public int binarySearch(int[] array, int key){
        var start = 0;
        var end = array.length - 1;

        while (start <= end){
            int middle = (start + end) >> 1;
            if(key == array[middle]){
                return middle;
            }
            if(key < array[middle]){
                end = middle - 1;
            }
            else{
                start = middle + 1;
            }
        }
        return -1;
    }
}
