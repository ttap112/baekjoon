class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        String text = ineq+eq;
        if (text.equals("<=")) {
            if (n<=m) {
                answer++;
            }
        } else if (text.equals(">=")) {
            if (n>=m) {
                answer++;
            }
        } else if (text.equals("<!")) {
            if (n<m) {
                answer++;
            }
        } else if (text.equals(">!")) {
            if (n>m){
                answer++;
            }
        }
        return answer;
    }
}