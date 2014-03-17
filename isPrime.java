import java.util.HashMap;

// To execute Java, please define "static void main" on a class
// named Solution.

class Solution {
  public static void main(String[] args) {
    boolean bPrime = false;
    for(int i = -2; i < 18;  i++){

      bPrime =  isPrime(i);
      if(bPrime){
        System.out.println(i+ " is a Prime");
      }else{
        System.out.println(i + " is not a prime");
      }  
    }
  }
  
  public static boolean isPrime(int n){
      if(n < 2){
        return false;
      }
      if(n == 2){
        return true;
      }
       
     if (n % 2 == 0){
       return false;
     }
     int i;
     double root = Math.sqrt(n);

    for(i = 3; i <= root;  i= i+2){
      System.out.println("value of i is " +  i);
      if(n % i == 0){
        System.out.println("returning false");
        return false;
      }
    }
    
      return true;
  }
}
