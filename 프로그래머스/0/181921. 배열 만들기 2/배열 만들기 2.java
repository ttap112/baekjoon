import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            String num = String.valueOf(i);
            if (num.matches("[05]+")) {  
                list.add(i);
            }
        }
        if (list.isEmpty()) {
            return new int[]{-1};  
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
