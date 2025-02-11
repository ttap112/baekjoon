class Solution {
    public String solution(String my_string, int[][] queries) {
        // String을 char 배열로 변환
        char[] arr = my_string.toCharArray();
        
        // queries에 대해 반복하며 구간을 뒤집음
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            
            // 구간 [s, e]을 뒤집기 위해 스왑
            while (s < e) {
                char temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        
        // 뒤집어진 배열을 다시 문자열로 변환
        return new String(arr);
    }
}
