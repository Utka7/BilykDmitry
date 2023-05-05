import java.util.Arrays;

public class DuplicateRemover {
    public int[] removeDuplicates(int[] array){
        var resultArray = new int[array.length];
        var index = 0;

        for (int i = 0; i < array.length; i++){
            var isDuplicate = false;
            for (int j = i + 1; j < array.length; j++){
                if(array[i] == array[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate){
                resultArray[index++] = array[i];
            }
        }

        int[] trimmedArray = new int[index];
        for (int i = 0; i < index; i++) {
            trimmedArray[i] = resultArray[i];
        }

        return trimmedArray;
    }
}
