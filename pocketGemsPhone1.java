"the quick brown fox" "fox" Write a function that takes both strings, and returns me the index (or pointer) of the first instance of the substring("fox") within the main string

public static int getFirstinstance(String input, String searchSt){

    int length =  input.length();
    int searchlength = searchSt.length();
    
    if(searchlength > length){
        return -1; // String cannot be found;
    }
    int j;
    for(int i = 0 ;  i <  length; i++){
        j =0;
        if(input.charAt(i) ==  searchSt.charAt(j)){
            j++;
            int k = i;
            k++;
            while(k < length && j < searchlength){
                if(input.charAt(k) ==  searchSt.charAt(j)){
                    k++;
                    j++;
                }else
                    break;
            }
            if(j ==  searchlength){
                return i;
            }else
                continue;
        }
    }
    return -1;
}

  A
 / \
B   C--E
 \ /
  D
  
Node {
    //list of nodes it's connected to
    //var connections = [a, d, e]
    List<Node> connected;
}

Write function called copy_graph that takes in a single node from the original graph, completely copies the structure of the graph and returns the copy of the node that was passed in

a -> a'

/*
    node is not null
    Hashmap<OrgNode, NewNode> hp
         firstNode  0x100     x2000
    if(hp.containsKey(Node.address))
    make a copy
    call the deep copy
    all of the connected
*/

  A
 / \                                 
B   C--E
 \ /
  D
  
  A'
 / \
B'  C'- E'          C 0x200 C'   
 \ / 
  D' 
  

public static Node deepCopy(Node input){
    if(input ==  null){
        return null;
    }
    HashMap<Node, Node> mapping =  new HashMap<Node, Node>();
    Node retNode = deepCopyList(input, mapping);
    
    return retNode;
}

public static Node deepCopyList(Node input, HashMap<Node, Node> mapping){
    
    if(mapping.containsKey(input)){
        return mapping.get(input);
    }
    else{
        Node newNode =  new Node();
        mapping.put(input, newNode);
        for(connect i : input.connected){
            newNode.connected.add(deepCopyList(i, mapping));    
        }
        return newNode;
    }
}




























