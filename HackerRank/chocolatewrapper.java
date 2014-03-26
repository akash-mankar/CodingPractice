import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
        }
    }

    private static long Solve(int n, int a, int b){

        //Write code to solve each of the test over here
        int iniNoChoc   =  n/a;

        int wrappers = iniNoChoc;
        int addChoc = 0;

        while(wrappers >= b){
            addChoc += wrappers/b;
            wrappers = wrappers%b + wrappers/b;
        }
        return(iniNoChoc + addChoc);
    }
}
