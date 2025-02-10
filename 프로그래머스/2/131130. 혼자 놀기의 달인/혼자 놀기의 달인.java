import java.util.*;

class Solution {
    public int solution(int[] cards) {
        boolean[] visited = new boolean[cards.length]; 
        List<Integer> cycleSizes = new ArrayList<>(); 
        
        for (int i = 0; i < cards.length; i++) {
            if (!visited[i]) {
                int count = 0;
                int index = i;

                while (!visited[index]) {
                    visited[index] = true;
                    index = cards[index] - 1;
                    count++;
                }

                cycleSizes.add(count); 
            }
        }
        if (cycleSizes.size() < 2) return 0;

        Collections.sort(cycleSizes, Collections.reverseOrder());
        return cycleSizes.get(0) * cycleSizes.get(1);
    }
}
