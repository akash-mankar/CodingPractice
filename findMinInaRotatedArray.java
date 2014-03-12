class Solution{
  public static void main(String[] args){
    int[] A = {4,5,8,9,1,2,3};
    int i = findmin(A, 0, A.length-1);
    System.out.println("Minimum element is: " +  i);
  }
  public static int findmin(int[] A, int low , int high){
    if(high < low) return A[0];
    if(high == low) return A[low];
    
    int mid = (low + high)/2;
    
    if(mid < high && A[mid+1] < A[mid]){
      return A[mid+1];
    }
    else if (mid > low && A[mid] < A[mid-1]){
      return A[mid];
    }
    if(A[high] > A[mid])
      return findmin(A, low, mid-1);
    else {
      return findmin(A, mid+1, high); 
    }
  }
}