3 4 5 6 7 70 34 30 20 10
1 2 5 6 7 8 9
9 8 7 6 4 5
/*
    mid = l + r /2   // 
    mid =  70
//    if mid[i] <mid[i-1] && mid [i] < mid[]  
*/


3 4 7 4 2 
a[mid] = 6
a[mid - 1] = 5
a[mid + 1] = 7

1] left :

2] right :

3] return mid :

!(a < b) || !(a < b)
(a > b) || (a > b)

public int searchPivot(int[] A) {
    int length = A.length;
    int l =  0;
    int r = length - 1;
    
    int mid = l + (r-l) /2 ;
    
    while(A[mid] >  A[mid-1] && A[mid] < A[mid+1]){
        if(A[mid] > A[mid -1]){
          r = mid -1;
        }
        else if(A[mid] < A[mid+1]){
           l = mid +1;
        }
        mid =  l + (r-l)/2;
    }
    return mid;
}

/*
keep the interviewer occupied
handle corner cases
if I change the example let the interviewer know.
three cases in binary search.
Consider a smaller example.

