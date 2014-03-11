import java.util.Arrays;
  
class AnagramObject implements Comparable{
     
    String word;
    int index;
  
    public AnagramObject( String word, int index){
      this.word  = word;
      this.index = index;
    }
  
    @Override
    public int compareTo(Object ao2){
        char[] a1 = ((AnagramObject)ao2).word.toCharArray();
        char[] a2 = word.toCharArray(); // this object
        
        Arrays.sort(a1);
        Arrays.sort(a2);
      
        return new String(a1).compareTo(new String(a2));
    }
}

class Anagrams{
    public void printAnagrams(String[] words){
      AnagramObject[] ArrayOfAO =  new AnagramObject[words.length];
      
      for (int i = 0;  i < words.length; i++){
        AnagramObject temp  = new AnagramObject(words[i], i);
        ArrayOfAO[i] = temp;
      }
      Arrays.sort(ArrayOfAO);
    }
    public static void main(String[] args){
        Anagrams anew = new Anagrams();
        String[] words = {"something", "thingsome", "xhsbfhd", "bfhdxhs", "abc", "sup", "cba", "pus"};
        anew.printAnagrams(words);
    }
}