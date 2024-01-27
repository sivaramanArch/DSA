import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> counter = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            counter.put(arr[i], counter.getOrDefault(arr[i], 0) + 1);
        }

        List<Integer> values = counter.values().stream().collect(Collectors.toList());

        Set<Integer> visited = new HashSet<>();

        for (Integer value : values) {
            if (visited.contains(value)) {
                return false;
            }

            visited.add(value);
        }

        return true;

    }
}