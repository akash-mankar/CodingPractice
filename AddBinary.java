import java.util.HashSet;

// To execute Java, please define "static void main" on a class
// named Solution.

class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.addBinary("1", "111"));
    }

    public String addBinary(String s1, String s2){
        int l1 = s1.length();
        int l2 = s2.length();
        int n1,n2;
        int sum  = 0;;
        int carry = 0;

        int i =  l1;
        int j =  l2;
        i--; j--;

        StringBuilder  m =  new StringBuilder();

        while(i >=0 && j >= 0){
            // 48 is ascii for 0.
            // any char 9
            // would be represented by 48+9 =  57 in ASCII
            // by subtracting 57 - 48
            // we get 9 which is a valid number
            n1 = (int)s1.charAt(i) - 48;
            n2 = (int)s2.charAt(j) - 48;
            // calculate sum first
            sum = n1 ^ n2;
            // Exor Opreration because when all  yes.
            //then you get a  no and when all are no
            //you give a yes, that is exactly an EX-Or.
         /*  
             truth tables for EX-or
             1 1 0
             0 0 0
             1 0 1
             0 1 0
          */

            // use the same operation to calculate carry
            carry  = sum ^ carry;
            carry = n1 & n2;
            m.append(sum);
            i--;
            j--;
        }

        while(i >= 0){
            n1 = (int)s1.charAt(i) - 48;
            int nextCarry = n1 & carry;
            n1 = n1 ^ carry; // Current sum
            carry = nextCarry;
            i--;
            m.append(n1);
        }

        while(j >= 0){
            n2 = (int)s2.charAt(j) - 48;
            int nextcarry =  n2 & carry;
            n2 = n2 ^ carry; // next sum;
            carry = nextcarry;
            m.append(n2);
            j--;
        }

        if(carry == 1){
            m.append(carry);
        }

        return m.reverse().toString();
    }

}