class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if (a > b) {
            for (int i = b; b<=a; b++) {
                answer += b;
            }
        } else if (b > a) {
            for (int i = a; a<=b; a++) {
                answer +=a;
            }
        } else {
            answer = a;
        }
        return answer;
    }
}