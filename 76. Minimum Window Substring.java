class Solution {
        public String minWindow(String s, String t) {
        if(t.length() > s.length() || s.length() == 0 || t.length() == 0){
            return "";
        }
            
        int[] sNum = new int[256];
        int[] tNum = new int[256];
        
        //init tNum
        for (char c : t.toCharArray()){
            tNum[c] += 1;
        }
        
        String ans = "";
        int minlen = s.length();
        
        //To find the minimum window
        int i = 0;
        int j = 0;
        for (i = 0; i < s.length(); i++){
            while(j < s.length() && !isCovered(sNum, tNum)){
                sNum[s.charAt(j)] ++;
                j++;
            }
            if (j - i <= minlen && isCovered(sNum, tNum)){
                ans = s.substring(i, j);
                minlen = j - i;
            }
            sNum[s.charAt(i)] --;
        }
        return ans;
    }

    //Test
    public boolean isCovered(int[] sNum, int[] tNum){
        for (int i = 0; i < tNum.length; i++){
            if (tNum[i] > sNum[i]){
                return false;
            }
        }
        return true;
    }
}