package Arrays;

import java.util.Arrays;

public class TwoIntegerSum {
    public static void main(String[] args){
        int[] nums = new int[]{1,2,3,4};
        int target = 3;
        System.out.println(Arrays.toString(twoSumSorted(nums, target)));
    }
    static int[] twoSumSorted(int[] nums,int target){
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            if(nums[i]+nums[j]>target){
                j--;
            }
            else if(nums[i]+nums[j]<target){
                i++;
            }
            else{
                return new int[]{i+1,j+1};
            }
        }
        return new int[]{0,0};
    }
}
