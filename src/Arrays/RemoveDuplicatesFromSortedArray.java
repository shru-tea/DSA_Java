// Input: nums = [1,1,2]
//Output: 2, nums = [1,2,_]
// Two pointer question !! --> in place sort
package Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2};
        int[] nums1 = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicatesFromSortedArray(nums));
        System.out.println(removeDuplicatesFromSortedArray(nums1));
    }

    static int removeDuplicatesFromSortedArray(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[count] = arr[i];
                count++;
            }
        }
        return count;
    }
}


