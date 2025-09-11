package Arrays;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args){
        int[] nums = new int[]{0,1,0,3,12};
        moveZeroesOptimized(nums);
    }
    static void moveZeroes(int[] nums){
        //[0,1,0,3,12]
        int count = 0;
        int k=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
            else {
                nums[i - count] = nums[i];
                k++;
            }
        }
        while(k<nums.length){
            nums[k]=0;
            k++;
        }
        System.out.println(Arrays.toString(nums));
    }
    static void moveZeroesOptimized(int[] nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[count]=nums[i];
                count++;
            }
        }
        while(count<nums.length){
            nums[count]=0;
            count++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
