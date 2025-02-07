class Solution {
    public int solution(int a, int d, boolean[] included) {
        int count = 0;
        int add = a;
        for (int i = 0; i<included.length; i++) {
            if (included[i]) {
                count +=a;
            }
            a+=d;
        }
        
        return count;
    }
}