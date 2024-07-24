package HashMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 5, 5, 3, 3, 2, 1, 1, 2, 4};

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for(int element : arr){
//            if(frequencyMap.containsKey(element)){
//                frequencyMap.put(element, frequencyMap.get(element)+1);
//            }
//            else {
//                frequencyMap.put(element, 1);
//            }
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        int maxNumber = -1;
        int maxFrequency = 0;
        Set<Map.Entry<Integer, Integer>> set = frequencyMap.entrySet();
        for(Map.Entry<Integer, Integer> element : set){
            if(maxFrequency < element.getValue()){
                maxNumber = element.getKey();
                maxFrequency = element.getValue();
            }
        }

        System.out.println(maxNumber);
        System.out.println(maxFrequency);

    }
}
