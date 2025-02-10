import java.util.*;

class Solution {
    public List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<>();
        int num = n;
        answer.add(n);
        while (num!=1) {
            if (num%2==0) {
                num/=2;
                answer.add(num);
            } else {
                num = 3*num+1;
                answer.add(num);
            }
        }
        return answer;
    }
}