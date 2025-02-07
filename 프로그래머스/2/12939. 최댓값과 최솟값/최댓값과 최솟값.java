class Solution {
    public String solution(String s) {
        
        String[] numList = s.split(" ");
        int[] num = new int[numList.length];
        for (int i = 0; i<num.length; i++) {
            num[i] = Integer.parseInt(numList[i]);
        }
        int min = num[0];
        int max = num[0];
        for (int i = 0; i<num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            } else if (num[i] < min) {
                min = num[i];    
            }
        }
        String Text = String.valueOf(min);
        Text+= " "+String.valueOf(max);
        
        return Text;
    }
}