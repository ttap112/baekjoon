import java.util.Arrays;

class Solution {
    public int[] solution(int[] numList) {
        int[] answer = {};
        answer = Arrays.copyOf(numList,numList.length+1);
        
        int lastNum = numList[numList.length-1];
        int secNum = numList[numList.length-2];
        if (lastNum > secNum) {
            answer[numList.length] = lastNum-secNum;
        } else {
            answer[numList.length] = lastNum*2;
        }
        return answer;
    }
}