import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc  = new Scanner(System.in);

        while(true){
            int input =  sc.nextInt();
          if(input <= 0){
            break;
          }
            int[] A = new int[input];
            for(int i = 0; i< input;  i++){
                A[i] = sc.nextInt();
            }

            int[] W = new int[input];
            for(int i = 0; i< input;  i++){
                W[i] = sc.nextInt();
            }

            int[] B = new int[A.length];
            for (int i =0;  i < B.length; ++i){
                B[i] =  1;
            }

            int[] V = new int[W.length];
            for (int i =0;  i < W.length; ++i){
                V[i] =  W[i];
            }

            for(int i = 0; i <  A.length; ++i){
                for(int j = 0; j < i; j++){
                    if(A[j] < A[i]){ // Very important Condition! for LIS
                        B[i] = maximum(B[i], B[j]+1);
                        V[i] = maximum(V[i], V[j]+W[i]);
                    }
                }
            }
            int max =  0;
            int index = -1;
            for(int i = 0; i< B.length; i++){
                 if(B[i] >= max && V[i] > index){
                     max = B[i];
                     index = V[i];
                 }
            }

            System.out.println(index);
        }
        return;
    }


    public static int  maximum(int i, int j){
        return (i > j)?i:j;
    }

}