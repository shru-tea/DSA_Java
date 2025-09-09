package Strings;

public class MaximumNestingDepthOfParanthesis {
    public static void main(String[] args){
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxNestingDepth(s));
    }
    static int maxNestingDepth(String s){
        int count=0;
        int maxCount=0;
        for(char ch: s.toCharArray()){
            if(ch=='('){
                count+=1;
                if(count>maxCount){
                    maxCount=count;
                }
            }
            else if(ch==')'){
                count-=1;
            }
        }
        return maxCount;
    }
}
