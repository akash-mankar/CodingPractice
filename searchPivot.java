
class Solution{
    public static void main(String[] args){
        int[] A = {1,5,8,9,7,4,2};
        int i = searchPivot(A, 0, A.length-1);
        System.out.println("index of the pivot element is: " +  i);
    }
    public static int searchPivot(int[] A, int low , int high){
        if(high < low) return -1;
        if(high == low) return low;

        int mid = (low + high)/2;

        //18542 123654
        //
        if(mid < high && A[mid] > A[mid-1] && A[mid] < A[mid+1]){
            return mid;
        }
        //mid =  5
        else if (mid > low && A[mid] < A[mid-1] && A[mid-1] > A[mid-2]){
            return mid-1;
        }
        if(A[low] >= A[mid])
            return searchPivot(A, low, mid-1);
        else {
            return searchPivot(A, mid+1, high);
        }
    }
}