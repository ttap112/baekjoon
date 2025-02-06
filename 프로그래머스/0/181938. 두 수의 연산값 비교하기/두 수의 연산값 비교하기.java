class Solution {
    public int solution(int a, int b) {
        int answer = 2*a*b;
        String num = String.valueOf(a);
        int numA = Integer.parseInt(num+b);
        if (answer > numA) {
            return answer;
        } else {
            return numA;
        }
    }
}