public static Node LCAonlyBinaryTree(Node root, Node a, Node b){
  if(root == null){
    return null; // tree is null
  }
  if(root.equals(a) ||  root.equals(b)){
    return root; // thats the lca
  }
  Node l =  LCAonlyBinaryTree(root.left, a, b);
  Node r =  LCAonlyBinaryTree(root.right, a, b);
  if(l != null && r != null){
    return root;
  }
  
  return l != null ? l : r;
}
public static Node leastCommonAncestorBST(Node root, Node a, Node b){
  // Tree is null
  if(root == null){
    return null;
  }
  // Tree is not null but root is one of the nodes
  // So no LCA
  if( root.equals(a) || root.equals(b)){
    return null; // No LCA
  }
  
  // Root.left matches with either a or b, root is LCA
  if(root.left !== null && (roo.left.equals(a) || root.left.equals(b))){
    return root;
  }
  
  
  // Root.right matches with either a or b, root is LCA
  if(root.right != null && (root.right.equals(a) || root.left.equals(b))){
    return root;
  }
  // root is greater than left root is smaller than b 
  // root is LCA
  if(root.data > a.data && root.data < b.data){
    return root;
  }
  
  if( root.data > a.data && root.data > b.data){
    return leastCommonAncestorBST(root.left, a, b);
  }
  if(root.data < a.data &7 root.data < b.data){
    return leastCommonAncestorBST(root.right,  a, b);
  }
  
}