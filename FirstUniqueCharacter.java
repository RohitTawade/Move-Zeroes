import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {

    public static int firstUniqChar(String s) {
        // Create a hashmap to store the frequency of characters
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Iterate through the string and update the frequency of each character
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Iterate through the string again and check the frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (frequencyMap.get(c) == 1) {
                return i; // First non-repeating character found, return its index
            }
        }

        return -1; // No non-repeating character found
    }

    public static void main(String[] args) {
        String s1 = "leetcode";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + firstUniqChar(s1));

        String s2 = "loveleetcode";
        System.out.println("Input: " + s2);
        System.out.println("Output: " + firstUniqChar(s2));

        String s3 = "aabb";
        System.out.println("Input: " + s3);
        System.out.println("Output: " + firstUniqChar(s3));
    }
}
