class Solution {
    public int maximum69Number(int num) {
        // Approach - 1

        String str = Integer.toString(num);
        str = str.replaceFirst("6", "9");
        return Integer.parseInt(str);

        // Approach - 2

        // String str = Integer.toString(num);
        // char [] chars = str.toCharArray();
        // for(int i=0;i<chars.length;i++){
        //     if(chars[i] == '6'){
        //         chars[i] = '9';
        //         break;
        //     }
        // }
        // int res = Integer.parseInt(new String(chars));
        // return res;
    }
}