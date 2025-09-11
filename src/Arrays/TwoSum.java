package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args){
        int[] arr = new int[] {};
        int[] arr1 = new int[]{2,7,11,15};
        int[] arr2 = new int[]{-8,1,4,6,10,45};
        int target = 26;
        System.out.println(Arrays.toString(twoSumSortedArray(arr2, target)));
        System.out.println(Arrays.toString(twoSumUnsortedArray(arr1, target)));

    }
    static int[] twoSumSortedArray(int[] arr,int target){
        //If it is already specified that array is sorted
        int[] result = new int[2];
        if(arr.length==0 || arr.length==1){
            return result;
        }
        int left=0;
        int right=arr.length-1;
        while (left<right){
            int sum = arr[left]+arr[right];
            if(sum==target){
                result[0]=left;
                result[1]=right;
                break;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        return result;
    }
    static int[] twoSumUnsortedArray(int[] arr,int target){
        // if the array is unsorted, need to use hashmap
        int[] result = new int[2];
        if(arr.length==0 || arr.length==1){
            return result;
        }
        HashMap<Integer,Integer> ans = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement = target-arr[i];
            if(ans.containsKey(complement)){
                int v = ans.get(complement);
                return new int[]{v,i};
            }else{
                ans.put(arr[i],i);
            }
        }
        return new int[]{0,0};
    }
}
