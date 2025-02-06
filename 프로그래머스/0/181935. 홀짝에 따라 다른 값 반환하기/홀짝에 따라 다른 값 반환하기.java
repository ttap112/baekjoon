class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 1 ;
        
        int ni = 2;
        if(n%2==0) {
            while (ni<=n) {
                answer += ni*ni;
                ni+=2;
            }
        } else {
            while (num<=n) {
                answer+=num;
                num+=2;
            }
        }
        
        return answer;
    }
}