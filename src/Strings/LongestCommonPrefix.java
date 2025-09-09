// ques - https://leetcode.com/problems/longest-common-prefix/description/?envType=problem-list-v2&envId=array
// array can be as long as 200
package Strings;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args){
        String[] arr = {"flower","flow","flight"};
        String[] arr1 = {};
        String[] arr2 = {"mower","tower","lower"};
        System.out.println(longestCommonPrefixNaive(arr));
        System.out.println(longestCommonPrefixNaive2(arr1));
        System.out.println(longestCommonPrefixOptimized(arr2));
    }
    static String longestCommonPrefixNaive(String[] arr){

        if(arr == null || arr.length == 0){
            return "";
        }
        // check characters of each element of the array
        String prefix = arr[0];
        for(int i=1;i<arr.length;i++){
            while(arr[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
            if(prefix.isEmpty()){
                break;
            }
        }
        return prefix;
    }

    static String longestCommonPrefixNaive2(String[] arr){

        if(arr == null || arr.length == 0){
            return "";
        }
        String prefix = arr[0];
        for(int i=1;i<arr.length;i++){
            int j=0;
            while(j<prefix.length() && j<arr[i].length() && prefix.charAt(j)==arr[i].charAt(j)){
                j++;
            }
            prefix=prefix.substring(0,j);

            // to ensure if prefix becomes empty, it will return early
            if(prefix.isEmpty()){
                return "";
            }
        }
        return prefix;
    }

    static String longestCommonPrefixOptimized(String[] arr){
       if(arr == null || arr.length == 0){
           return "";
       }
       StringBuilder ans = new StringBuilder();
       Arrays.sort(arr);
       String s1 = arr[0];
       // s1=flight, s2=flower
       String s2 = arr[arr.length-1];
       for(int i=0;i<s1.length();i++){
           if(s1.charAt(i)==s2.charAt(i)){
               ans.append(s1.charAt(i));
           }
           else{
               break;
           }
       }
        return ans.toString();
    }
}
