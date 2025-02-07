class Solution {
    public int solution(int[] numListI) {
        String[] numList = new String[numListI.length];
        for (int i = 0; i<numListI.length; i++) {
            numList[i] = String.valueOf(numListI[i]);
        }
        
        String result1 = "";
        String result2 = "";
        
        for (int i = 0; i<numList.length; i++) {
            if (numListI[i]%2==0) {
                result1+=numList[i];
            } else {
                result2+=numList[i];
            }
        }
        int answer = Integer.parseInt(result2)+Integer.parseInt(result1);
        
        return answer;
    }
}