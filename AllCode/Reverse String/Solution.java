public class Solution {
    public String reverseString(String s) {
        StringBuffer sb=new StringBuffer(s);
    	sb=sb.reverse();
		return sb.toString();
    }
}