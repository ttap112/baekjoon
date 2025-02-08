class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        String[] Text = control.split("");
        for (int i = 0; i<Text.length; i++) {
            if (Text[i].equals("w")) {
                n++;
            } else if (Text[i].equals("s")) {
                n--;
            } else if (Text[i].equals("d")) {
                n+=10;
            } else {
                n-=10;
            }
        }
        answer = n;
        return answer;
    }
}