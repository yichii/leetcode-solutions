import java.util.HashMap;
import java.util.Collections;
import java.util.Map;

class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        for (int num : nums) {
            numbers.put(num, numbers.getOrDefault(num, 0) + 1);
        }

        int[] maxValues = new int[k];
        for (int i = 0; i < maxValues.length; i++) {
            Map.Entry<Integer, Integer> max = numbers.entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow();
            maxValues[i] = max.getKey();
            numbers.remove(maxValues[i]);
        }
        return maxValues;
    }
}