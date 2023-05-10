import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateFinder<T> {
    public Map<T, Integer> findDuplicate(List<T> list){
        var countMap = new HashMap<T,Integer>();

        for (T element : list){
            countMap.merge(element,1,Integer::sum);
        }

        var duplicatesMap = new HashMap<T,Integer>();

        for(var entry : countMap.entrySet()){
            if (entry.getValue() > 1){
                duplicatesMap.put(entry.getKey(), entry.getValue());
            }
        }

        return duplicatesMap;
    }
}
