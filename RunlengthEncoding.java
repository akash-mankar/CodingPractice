 // Only counting the number of occurences here:
// input: aaabbcdddda
 // output: a4b2c1d4
public String encode (String s) {
    HashMap<String, Integer> countMap =  new HashMap<String, Integer>();
    
    for (int i = 0 ;  i < s.length(); i ++ ){
        if(countMap.containsKey(s[i])){
            countMap.put(s[i] , countMap.get(s[i]) +  1);
        }else
            countMap.put(s[i], 1);
    }
    
    String s1 =  new String();

    for (Map.Entry<String, Integer> entry : countMap.entrySet())
    {
        System.out.print(entry.getKey() + "/" + entry.getValue());
        s1.append(entry.getKey());
        s1.append(entry.getValue());
    }
    return s1;
}

// Different case
// input: aaabbcdddda
 //output: a3b2c1d4a1
public String encode (String s) {
     boolean bSame = false;
     String s1 = new String();
     int count  = 1;
     int j = 0;
     if(s.length == 0){
         return s;
     }   
    for (int i = 1 ;  i < s.length(); i ++ ){
         
         if(s.charAt(i) == s.charAt(i-1)){
             count++;
             if(s1.chrAt(j) != s.charAt(i)){
               s1.append(s.charAt(i));
             }
         }else {
            s1.append(count);
            s1.append(s.charAt(i));
            count = 1;
            j++;
         }  
         
    }
    return s1;
}