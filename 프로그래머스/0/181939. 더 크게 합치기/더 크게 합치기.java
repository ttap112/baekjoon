class Solution {
    public long solution(long a, long b) {
        
        String numA = String.valueOf(a);
        long num = Integer.parseInt(numA+b);
        
        String numB = String.valueOf(b);
        long numm = Integer.parseInt(numB+a);
        
        if (numm>num) {
            return numm;
        } else {
            return num;
        }
    }
}