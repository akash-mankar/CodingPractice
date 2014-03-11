import java.util.HashSet;

// To execute Java, please define "static void main" on a class
// named Solution.

class Solution {
  public static void main(String[] args) {
    int[] A  =  {1,2,3,4,5,6,7,8};
    int sum  =  11;
    countTriplets(A, sum);
  }
  
  public static void countTriplets(int[] A, int sum){
    int length =  A.length;
    int count  = 0;
    HashSet<Integer> m = new HashSet<Integer>();   
    for(int i = 0; i < length;  i++){
        for(int j =  i+1; j < length; j++){
           m.add(A[i] + A[j]);
        }
    }
    
    for (int k = 2; k < length; k++){
      int temp =  sum - A[k];
      if(m.contains(temp)){
        count++;
      }
    }
    System.out.println("Total number of pairs are " +  count );
  }
}
