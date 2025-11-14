import java.util.*;
public class cha {
    public static void main(String[] args) {
        String str = "hihio";
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        map.forEach((key, value) -> {
            if(value==1)
            System.out.println("Character: " + key + " → Frequency: " + value);
        });
    }

}
