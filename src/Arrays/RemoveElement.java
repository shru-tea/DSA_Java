package Arrays;

public class RemoveElement {
    public static void main(String[] args){
        //[3,2,2,3],val=2
        System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2},2));
                                                // 0,1,3,0,4,_,_,_
        System.out.println(removeElementOptimized(new int[]{0,1,2,2,3,0,4,2},2));
    }
    static int removeElement(int[] nums,int val){
        if(nums.length == 0){
            return 0;
        }
        int count =0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                count++;
            }else{
                nums[i-count] = nums[i];
                k++;
            }
        }
        return k;
    }

    static int removeElementOptimized(int[] nums,int val){
        if(nums.length==0){
            return 0;
        }
        int k =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}
