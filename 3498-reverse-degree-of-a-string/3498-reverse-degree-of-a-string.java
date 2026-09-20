class Solution {
    public int reverseDegree(String s) {
       int sum=0;
       for(int i=0;i<s.length();i++){
        char each=s.charAt(i);
        int eachvalue=26-(each-'a');
        sum +=eachvalue*(i+1);
       }
       return sum;
    }
}