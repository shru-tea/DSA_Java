package Strings;

public class LengthOfLastWord {
    public static void main(String[] args){
        String s1 = "Hello World";
        String s2 = "   fly me   to   the moon  ";
        String s3 = "luffy is still joyboy";
        String s4 = " ";
        System.out.println(lengthOfLastWordNaive(s2));
        System.out.println(lengthOfLastWordOptimized(s4));
    }
    static int lengthOfLastWordNaive(String s){
        if(s.isEmpty()){
            return 0;
        }
        s=s.trim();
        String[] arr = s.split(" ");
        int l = arr[arr.length-1].length();
        return l;
    }
    static int lengthOfLastWordOptimized(String s){
        // need to iterate and calculate the length of last word
        int end = s.length()-1;
        while(end>=0 && s.charAt(end) == ' '){
            end--;
        }
        int start=end;
       while(start>=0 && s.charAt(start) != ' '){
           start--;
       }
        return end-start;
    }
}
