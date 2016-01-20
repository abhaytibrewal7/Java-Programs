package Recursion;

public class ReversingString {

    static String rev="";
    public static void main(String[] args) {
        String s = "Abhay";
        String rev = reverseString(s, -1);
        System.out.println(rev + " ");
    }

    static String reverseString(String s, int i) {
        if (i == s.length()-1) {
            return s;   //or return null
        }
        i++;
        reverseString(s, i);
        rev=rev + s.charAt(i);
        return rev;
    }
}
