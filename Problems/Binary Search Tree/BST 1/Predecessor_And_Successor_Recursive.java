# https://practice.geeksforgeeks.org/problems/predecessor-and-successor/1#

class Predecessor_And_Successor_Recursive {
    
    public static void findPreSuc(Node root, Res p, Res s, int key) {
        
        if (root==null) {
            
            return;
        }
        
       findPreSuc(root.left, p, s, key);
       
       if (root.data < key) {
           
           p.pre = root;
       }
       
       if (root.data > key && s.succ == null) {
           
           s.succ=root;
       }
       
       findPreSuc(root.right, p, s, key);
    }
}
