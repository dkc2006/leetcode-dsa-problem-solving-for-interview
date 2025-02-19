class Solution {
    String res;
    int count;
    public String getHappyString(int n, int k) {
        count=0;
        res="";
        backtrack(n,k,new StringBuilder(""));
        return res;
    }
    public boolean backtrack(int n, int k, StringBuilder cur){
        //base case
        if(cur.length() == n){
            count++;
            if(count==k){
                res = cur.toString();
                return true;
            }
            return false;
        }
        for(char ch='a';ch<='c';ch++){ //2
            int len = cur.length();
            if(len>0 && cur.charAt(len-1) == ch) continue;
            cur.append(ch);
            if(backtrack(n,k,cur)){
                return true;
            }
            cur.deleteCharAt(cur.length()-1);
        }
        return false;
    }
}

                                // OR

//class Solution {
//    public String getHappyString(int n, int k) {
//        List<String> happyStrings = new ArrayList<>();
//        generateHappyStrings("", n, happyStrings);
//        if (k > happyStrings.size()) {
//            return "";
//        }
//        return happyStrings.get(k - 1);
//    }
//    private void generateHappyStrings(String current, int n, List<String> happyStrings) {
//        if (current.length() == n) {
//            happyStrings.add(current);
//            return;
//        }
//        for (char ch = 'a'; ch <= 'c'; ch++) {
//            if (current.length() == 0 || current.charAt(current.length() - 1) != ch) {
//                generateHappyStrings(current + ch, n, happyStrings);
//            }
//        }
//    }
//}


