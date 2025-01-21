import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SortCharactersByFrequency {
    public String frequencySort(String s) {
      
        Map<Character, Integer> set = new HashMap<>();
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            set.put(key, set.getOrDefault(key, 0)+1);
        }

        ArrayList<Character> list = new ArrayList<>(set.keySet());
        list.sort((obj1,obj2) -> set.get(obj2) - set.get(obj1));
        System.out.println(list);

        for (Character character : list) {
            for (int i = 0; i < set.get(character); i++) {
                ans+= character;
            }
        }
        return ans;
    }
}
