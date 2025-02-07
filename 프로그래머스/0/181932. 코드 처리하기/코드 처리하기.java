class Solution {
    public String solution(String code) {
        int index = 0;
        boolean modeSet = true;
        String[] codes = code.split("");
        String ret = "";
        if (ret.equals("1")) {
                modeSet = false;
            }
        
        for (int i = 0; i<codes.length; i++) {
            if (modeSet) {
                if (codes[i].equals("1")) {
                    modeSet = false;
                    continue;
                }
                if (i%2==0) {
                    ret+=codes[i];
                }
            }
            if(!modeSet) {
                if (codes[i].equals("1")) {
                    modeSet = true;
                    continue;
                }
                if (i%2!=0) {
                    ret+=codes[i];
                }
            }
        }     
        
        if ( ret.isEmpty()) {
            return "EMPTY";
        } else {
            return ret;
        }
    }
}