package string.jewels_and_stones;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelSet = new HashSet<>();
        for (char jewel: jewels.toCharArray()) {
            jewelSet.add(jewel);
        }

        int count = 0;
        for (char stone : stones.toCharArray()) {
            if (jewelSet.contains(stone)) {
                count += 1;
            }
        }
        return count;
    }

    public int numJewelsInStones2(String jewels, String stones) {
        int count = 0;
        for (int i =0; i < stones.length(); i++) {
            if (jewels.indexOf(stones.charAt(i)) > -1) {
                count += 1;
            }
        }
        return count;
    }
}
