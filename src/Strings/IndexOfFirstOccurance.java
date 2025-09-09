package Strings;

public class IndexOfFirstOccurance {
    public static void main(String[] args){
        String haystack = "leetcode";
        String needle = "tco";
        System.out.println(indexOfFirstOccurance(haystack,needle));
        System.out.println(indexOfFirstOccuranceWithoutInbuiltFunction(haystack,needle));
    }
    static int indexOfFirstOccurance(String haystack,String needle){
        if(haystack.isEmpty() || needle.isEmpty()){
            return -1;
        }
        return haystack.indexOf(needle);
    }
    static int indexOfFirstOccuranceWithoutInbuiltFunction(String haystack,String needle){
        return 0;
    }
}
