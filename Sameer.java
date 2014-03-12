[2, 7, 4, 6] -> [2, 7, 4, 7]
int[] increament(int[] number) {
    int length = number.length; // 4
    int[] temp;
 //    if(A[0] == 9){ 
      // temp =  new int[length+1]; 
 
    int carry = 0;

    for(int i =  length-1;  i >= 0;  i--){
        int tem1 =  A[i];
        if(carry){
            
        }else
           
        if(tem1+1 >= 10){
            tem1++;
            temp[i+1] = tem1 & (1);
            carry = 1;
        }else{
            temp[i+1] = tem1; // size -1 of temp
            if(carry){
                temp[i+1] += 1;
                carry = 0;
            }
        } 
        
    }
    if(carry){
        temp[0] = 1;
    }else
        temp[0] = 0;
    return temp;
}


int[] increament(int[] number) {
    for (int itr = number.length - 1; itr >= 0; itr--) {
        if (number[itr] != 9) {
            number[itr] =  number[itr]  + 1;
            return number;
        }
        number[itr] = 0;
    }
    int[] newNumber = new int[number.length + 1];
    newNumber[0] = 1;
    return newNumber;
}

2749
2740


public static List<List<String>> getAnagrams(List<String> input)
   //
   basically
   sort input  O(n) 0-> input[i] Key ->  value is sorted.
   
   
   abc 
   cba
   2Input2 -> for i  if input2[i] == input[i] Add List<List<String>
   abc abc 0 
   cba abc 2
     
     HashMap<String, List<List<String>>> m =  new HashMap<String,  <List<List<String>>>();  
     
public static List<List<String>> getAnagrams(List<String> input) {
    Map<String, List<String>> anagramToStringList = new HashMap<String, List<String>>();
    
    // Check why a set is used
    for (String s: input) {
        originalString = s;
        s = s.sort();
        Set<String> anagrams = anagramToStringList.getKeys();
        
        if (anagrams.contains(s)) {
            List<String> stringsForS = anagramToStringList.get(s);
            stringsForS.add(originalString);
            anagramToStringList.put(s, stringsForS);                
        }
        else {
            
            anagramToStringList.getKeys().add(s);
            List<String> emptyList = new LinkedList<String>();
            emptyList.add(originalString);
            anagramToStringList.put(s, emptyList);
        }
    }

    List<List<String>> answer = new LinkedList<List<String>>();
    
    for (Entry<String, String> entry: anagramToStringList) {
        answer.add(entry.value);
    }
    
    return answer;
}





/**
 * An iterator that iterates over an array, returning the next even value
 * in the array.
 * Example: [ 1, 4, 8, 3, 2, 5 ]
 *  next() --> 4
 *  next() --> 8
 *  next() --> 2
 */
 java.util.Arrays
public class EvenIterator {
    int currindex;
    int[] values;
    public EvenIterator(int[] values) {
        currindex =0;
        this.values = values;
        
        Arrays.fill.
        Arrays.valytoCharArray
        Arrays.sort      
    }
    /**
     * Returns the next even number in the underlying data.
     */
    public int next() {
        currindex += 2;
        return values[currindex];
    }
    
    public boolean hasNext() {
        // Out of bounds
        if(currindex + 2 > values.length-1)
            return false;
        
        return true;
    }
    
    public static void main(String[] args) {
        int[] array = {...};
        EvenIterator ei = new EvenIterator(array);
        while ((Integer i = ei.next()) != null) {
            system.out.println(i);
        }
        while (ei.hasNext()) {
            sys.out.println(ei.next());
        }
    } 
}


​/**
 * An iterator that iterates over an array, returning the next even value
 * in the array.
 * Example: [ 1, 4, 8, 3, 2, 5 ]
 *  next() --> 4
 *  next() --> 8
 *  next() --> 2
 */
public class EvenIterator {
    
    private int[] values;
    private int index;
    
    public EvenIterator(int[] values) {      
        this.values = values;
        this.index  = 0;
    }
    /**
     * Returns the next even number in the underlying data.
     */
    public int next() {
        boolean b = hasNext();
        if (b)
            index++;
            return values[index - 1];
        }
        else {
            throw
        }
    }
    
    public boolean hasNext() {
        while (index < values.length) {
            if (values[index]%2 ==0) {
                return true;
            }
            else {
                index++;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] array = {...};
        EvenIterator ei = new EvenIterator(array);
        while ((Integer i = ei.next()) != null) {
            system.out.println(i);
        }
        while (ei.hasNext()) {
            sys.out.println(ei.next());
        }
    } 
}

    
// Yelp

// Determine the top ten most frequent search queries from a log of one day's search queries
//
// Input: List of search queries ['dinner', 'dog food', 'dinner', 'burrito',...]
// Output: List of the top then queries in order of frequency ['dinner', 'restaurant', ...]

// 
​public static Map<String, Integer> getCounts(List<String> queries) {
    Map<String, Integer> queryCount = new HashMap<String, Integer>();
    for (String s : queries) {
        Integer count = queryCount.get(s);
        if (count == null) {
            count = 0;
        }
        count++;
        queryCount.put(s, count);
    }
    
    return queryCount;
}

public static List<String> getTopNQueries(List<String queries, int n) {
    Heap heap = new Heap(n);
    Map<String, Integer> queryCount = getCounts(queries);
    for (Entry<String, Integer> entry : queryCount.entrySet()) {
        WordFreq wf = new WordFreq(entry.getKey(), entry.getValue();
        heap.add(wf);
    }
    
    return heap.getValues();
}

class WordFreq() {
    String word;
    int count;
}

class Heap() {
    int count;
    
    public Heap(int n);
    
    public void add(WordFreq wordfreq);// would have logic to maintain the top n elements
    
    
    public List<String> getValues();
}



Roman numbers =? decimal
Sudoku! -> 

Next inorder successor
3
4

    4
  2  9
  // Case when the number is not in the tree.
  
  
  
  
        100
       /   \
     80     120
    /  \       \ 
   50   90      150


70 -> 80
80 -> 90
85 -> 90

class Node {
    Node right;
    Node left;
    int value;
}

Node nextLarger(Node root, int number) {
    if (root.value > number) {
        if (root.left == null) {
            return null;    
        }
        Node t = nextLarger(root.left, number);
        if (t == null && root.value > number) {
            return root;
        }
        else {
            return t;
        }
    }
    else {
        if (root.right == null) {
            return null;
        }
        return nextLarger(root.right, number);
    }
}
