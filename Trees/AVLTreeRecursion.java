//from geeksforgeeks and https://github.com/mission-peace/interview/blob/master/src/com/interview/tree/AVLTree.java
//also refer rosetta code


package Trees;

public class AVLTreeRecursion {
    public static void main(String[] args) {
        
        BuildAVLTree avl = new BuildAVLTree();
        Node root = null;
        for(int i=0;i<=10;i++){
            if(i!=3)
                root = avl.insert(root ,i);            
        }
        
        root = avl.delete(root, 4);
        root = avl.delete(root, 1);
        root = avl.insert(root, 12);
        root = avl.insert(root, 13);
        root = avl.delete(root, 8);
        
        avl.inorder(root);
        System.out.println("");
        avl.preorder(root);
        System.out.println("");
        avl.postorder(root);
    }
}

class Node {    

    int value, height;
    Node lchild=null;
    Node rchild=null;
    Node parent;

    Node(int a) {
        value = a;
    }
}

class BuildAVLTree {

    Node root;

    Node insert(Node current, int a) {   //initially current==root;
    
        if (current == null) {
            current = new Node(a);                  /****************important comment niche*****************/
            current.height = setHeight(current);   ////////////  important...idhar height nhi set karoge...to last insertion ka height kabhi set nhi hogaaaaa...pakka se settt.........
            return current;
        } else if (current.value > a) {
            current.lchild = insert(current.lchild, a);
        } else if (current.value < a) {
            current.rchild = insert(current.rchild, a);
        }

        current = reBalance(current);
        
        return current;
    }

    
    Node delete(Node current , int delValue){
        
        if(current == null)
            return current;
        else if( current.value > delValue)
            current.lchild = delete(current.lchild,delValue);
        else if(current.value < delValue)
            current.rchild = delete(current.rchild ,delValue);
        
        else { //found
            
            /* For One or No Child */
            if((current.lchild == null) || (current.rchild == null)){
                
                Node temp = current.lchild!=null ? current.lchild : current.rchild;
                
                if(temp == null) { //both left nd right are null..ie no child
                    current = null;                    
                }
                else   //has one child
                    current = temp;
                
                temp=null;
            }
            /* for both the childs */
            else{
                
                Node temp = successor(current.rchild);  //smallest in the right subtree
                
                current.value = temp.value;
                
                //deleting successor now after its value is been copied
                current.rchild = delete(current.rchild ,temp.value);
            }                
        }
        
        if(current == null)   //if tree has only one node then return;
            return current;              //thora unsure about it
        
        current = reBalance(current);
        
        return current;
    }
    
    Node successor(Node current){
        
        while(current.lchild != null)
            current = current.lchild;
        return current;
    }
    
    Node reBalance(Node current) {

        int bal = setBalance(current.lchild, current.rchild);
        
        if (bal > 1){   //left imbalance
            if(height(current.lchild.lchild) >= height(current.lchild.rchild)){ //normal right rotation hoga
                current=rightRotate(current);
            }
            else{   //pehle do left rotate then right
                current.lchild = leftRotate(current.lchild);
                current= rightRotate(current);
            }
        }
        else if(bal < -1){ //right imbalance
            if(height(current.rchild.rchild) >= height(current.rchild.lchild)) { //normal left rotation
                current = leftRotate(current);
            }  
            else{  // pehle right rotate then left rotate
                current.rchild = rightRotate(current.rchild);
                current = leftRotate(current);
            }            
        }
        else{   //tree balanced
           current.height = setHeight(current);
        }
        return current;
    }
    
 /*******************Important Point**************************/   
    //since cuurent node is recursively returned...hence we 
    // do not set.. newRoot.parent = node.parent and
    // node.parent = newRoot
    // in rightRotate and leftRotate function
    //do above if not using recursion while inserting
 /***************************************************************/
    
    
    Node rightRotate(Node node){
        
        Node newRoot = node.lchild;
        node.lchild = newRoot.rchild;
        newRoot.rchild = node;
        
        node.height = setHeight(node);
        newRoot.height = setHeight(newRoot);
        
        return newRoot;
    }
    
    Node leftRotate(Node node){
        
        Node newRoot = node.rchild;
        node.rchild = newRoot.lchild;
        newRoot.lchild = node;
        
        node.height = setHeight(node);
        newRoot.height = setHeight(newRoot);
        
        return newRoot;
    }
    
    int setBalance(Node left, Node right) {
        return height(left) - height(right);
    }

    int height(Node node) {
        if (node == null) {
            return 0;
        } else {
            return node.height;
        }
    }

    int setHeight(Node node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + Math.max((node.lchild != null ? node.lchild.height : 0), (node.rchild != null ? node.rchild.height : 0));
        }
    }
    
    void inorder(Node root){
        if(root == null)
            return;
        else{
            inorder(root.lchild);            
            System.out.println(root.value + "  " + root.height);
            inorder(root.rchild);
        }
    }
    
    void preorder(Node root){
        if(root == null)
            return;
        else{
            System.out.println(root.value+"  " + root.height);
            preorder(root.lchild);
            preorder(root.rchild);
        }
    }
    
    void postorder(Node root){
        if(root == null)
            return;
        else{
            postorder(root.lchild);
            postorder(root.rchild);
            System.out.println(root.value+"  "+root.height);            
        }

    }
}
