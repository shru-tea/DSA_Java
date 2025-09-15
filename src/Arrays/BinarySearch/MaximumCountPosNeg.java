package Arrays.BinarySearch;

import static java.lang.Math.max;

public class MaximumCountPosNeg {
    public static void main(String[] args){
        int[] nums = new int[]{-3,-2,-1,0,0,1,2};
        System.out.println(maximumCountOfPosAndNegNaive(nums));
    }
    static int maximumCountOfPosAndNegNaive(int[] nums){
        int pos =0;
        int neg=0;
        for (int num : nums) {
            if (num == 0) {
                continue;
            } else if (num > 0) {
                pos++;
            } else {
                neg++;
            }
        }
        return max(pos,neg);
    }
    static int maximumCountOfPosAndNegBinarySearch(int[] nums){
        return 0;
    }
}
