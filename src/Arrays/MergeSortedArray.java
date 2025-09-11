package Arrays;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args){
        int[] nums1=new int[] {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = new int[] {2,5,6};
        int n=3;
        mergeSortedArray(nums1, m, nums2, n);
    }

    static void mergeSortedArray(int[] nums1,int m,int[] nums2,int n){
        int p1=0;
        int p2=0;
        int[] merge = new int[m+n];
        int k=0;
        while(p1<m && p2<n){
            if(nums1[p1]<nums2[p2]){
                merge[k]=nums1[p1];
                p1++;
            }else{
                merge[k]=nums2[p2];
                p2++;
            }
            k++;
        }
        while(p1<m){
            merge[k]=nums1[p1];
            p1++;
            k++;
        }
        while (p2<n){
            merge[k]=nums2[p2];
            p2++;
            k++;
        }
        System.out.println(Arrays.toString(merge));
    }

    static void mergeSortedArrayOptimized(int[] nums1,int m,int[] nums2,int n) {
        int pt1 = m-1;
        int pt2 = n-1;
        int k = m+n-1;
        while(pt2>=0){
            if(pt1>=0 && nums1[pt1]<nums2[pt2]){
                nums1[k]=nums2[pt2];
                pt2--;
            } else{
                nums1[k]=nums1[pt1];
                pt1--;
            }
            k--;
        }
        System.out.println(Arrays.toString(nums1));
    }
}
