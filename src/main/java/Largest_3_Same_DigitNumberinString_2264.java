class Solution {
    public String largestGoodInteger(String num) {
        // Approach -1 


        // String max = "";
        // for (int i = 0; i <= num.length() - 3; i++) {
        //     char ch = num.charAt(i);
        //     if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i) == num.charAt(i + 2)) {
        //         String triple = num.substring(i, i + 3);
        //         if (max.isEmpty() || triple.compareTo(max) > 0) {
        //             max = triple;
        //         }
        //     }
        // }
        // return max;

        // Approach - 2

        String [] str = {"999","888","777","666","555","444","333","222","111","000"};
        for(int i=0;i<str.length;i++){
            if(num.contains(str[i])){
                return str[i];
            }
        }
        return "";
    }
}