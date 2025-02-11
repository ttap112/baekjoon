class Solution {
    public int solution(String number) {
        int answer = 0;
        String[] num = number.split("");
        for (int i = 0; i<num.length; i++) {
            answer += Integer.parseInt(num[i]);
        }
        return answer%9;
    }
}