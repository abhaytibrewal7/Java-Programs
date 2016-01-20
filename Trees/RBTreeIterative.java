///********** code from geeksforgeeks *************/
//
//package Trees;
//
//public class RBTreeIterative {
//    public static void main(String[] args) {
//        
//        BuildRBTree rb = new BuildRBTree();
//                
//        for(int i=0; i<=10 ; i++)
//            rb.insert(i);
//        
//        rb.inorder(rb.root);
//        System.out.println("");
//        rb.preorder(rb.root);
//        System.out.println("");
//        rb.postorder(rb.root);
//        
//    }
//}
//
//class Node{
//    
//    int value;
//    Node lchild,rchild,parent;
//    char color;
//    Node(int a){
//        value=a;
//    }
//}
//
//class BuildRBTree{
//    
//    Node root;
//    void insert(int a){
//        
//        Node newNode = new Node(a);
//        newNode.lchild = newNode.rchild = newNode.parent = null;
//        newNode.color = 'R';
//        
//        if(root == null){                    
//            root = newNode;
//            newNode.color = 'B';
//        }
//        
//        else {
//            
//            Node parent = null;
//            Node current = root;
//            while(current != null){
//                parent = current;
//                
//                if(current.value < newNode.value)
//                    current = current.rchild;
//                else
//                    current = current.lchild;
//            }
//            newNode.parent = parent;
//            if( newNode.value < parent.value)
//                parent.lchild = newNode;
//            else
//                parent.rchild = newNode;
//        }
//        //if(newNode.parent!=null)
//          //  System.out.println(newNode.parent.value+"Parent of"+newNode.value);
//        insertFix(newNode);
//    }
//    
//    void insertFix(Node current){
//        
//        while(current != root && current.parent.color == 'R'){
//          //  System.out.println(""+current.value);
//            Node uncle;
//            if(current.parent.parent.lchild == current.parent) { //current ka parent grandfather ka left child h
//          //      System.out.println(current.value+"uncle left");                
//                uncle = current.parent.parent.rchild;           
//            }
//            else{
//            //    System.out.println(current.value+"uncle right");            
//                uncle = current.parent.parent.lchild;
//            //    if(uncle!=null)
//            //        System.out.println(current.value+" "+uncle.value+" "+uncle.color +"uncle informatiion");
//            }
//            
//            if(uncle!=null && uncle.color == 'R') {
//            //    System.out.println(uncle.value+"uncle value");
//                uncle.color = 'B';
//                current.parent.color = 'B';
//                current.parent.parent.color = 'R';                
//                current = current.parent.parent;
//            }
//            //isme jane ka baad while loop terminate ho jyega because current ka parent ka color black ho jyega sinse wo root ho jyega
//            //rotation ke baad returning root
//            else { //uncle is black...so rotations karna hoga
//                
//                 // Left-Left (LL) case, do following
//                 // (i)  Swap color of parent and grandparent
//                 // (ii) Right Rotate Grandparent
//              //  System.out.println(current.value+"entering else  ");
//                if((current.parent.parent.lchild == current.parent && (current) == current.parent.lchild)) {
//                //    System.out.println(current.value+"right rotate");
//                    char ch = current.parent.color;
//                    current.parent.color = current.parent.parent.color;
//                    current.parent.parent.color = ch;
//                    rightRotate(current.parent.parent);
//                    
//                }
//                // Left-Right (LR) case, do following
//                // (i)  Swap color of current node  and grandparent
//                // (ii) Left Rotate Parent
//                // (iii) Right Rotate Grand Parent
//                else if((current.parent.parent.lchild == current.parent && (current) == current.parent.rchild)){
//                  //  System.out.println(current.value+"left right rotate");
//                    char ch = current.color;
//                    current.color = current.parent.parent.color;
//                    current.parent.parent.color = ch;
//                    leftRotate( current.parent);
//                    rightRotate(current.parent);  //since abhi current is changed after left rotate
//                }
//                //Right Right(RR
//                //swap color of parent and grandparent
//                //right rotate
//                else if((current.parent.parent.rchild == current.parent && (current) == current.parent.rchild)) {                    
//                    //System.out.println(current.value+"left rotate");
//                    char ch = current.parent.color;
//                    current.parent.color = current.parent.parent.color;
//                    current.parent.parent.color = ch;
//                    leftRotate(current.parent.parent);                   
//                }
//                //right left case
//                //swap current and grandparent
//                //right rotate
//                //left rotate
//                else if((current.parent.parent.rchild == current.parent && (current) == current.parent.lchild)){
//                    //System.out.println(current.value+"right left rotate");
//                    char ch = current.color;
//                    current.color = current.parent.parent.color;
//                    current.parent.parent.color = ch;
//                    rightRotate(current.parent);
//                    leftRotate(current.parent);  //since abhi current is changed after left rotate
//                }                
//            }
//        }
//        root.color = 'B';
//    }
//    //dont return anything in right and left rotate function else error ho jyega...
//    //after performing this function while loop should be terminated
//    void rightRotate(Node node){
//        
//        Node newRoot = node.lchild;
//        node.lchild = newRoot.rchild;
// 
//        //Changing parent of evryone
//        if(newRoot.rchild != null)
//            newRoot.rchild.parent=node;
//        newRoot.parent=node.parent;
//        
//        //if root to change
//        if(newRoot.parent == null)
//            root = newRoot;
//        
//        //changing child of previous parent node
//        if(node.parent!=null && node.parent.lchild == node)
//            node.parent.lchild = newRoot;
//        else if(node.parent!= null)
//            node.parent.rchild = newRoot;
//        
//        newRoot.rchild = node;
//        node.parent = newRoot;
//                
//    }
//    
//    void leftRotate(Node node){
//        
//        Node newRoot = node.rchild;
//        node.rchild = newRoot.lchild;
//        
//        newRoot.parent = node.parent ;
//        
//        if(newRoot.lchild != null)
//            newRoot.lchild.parent=node;
//        
//        if(node.parent == null)
//            root = newRoot;
//        if(node.parent!=null && node.parent.rchild == node)
//            node.parent.rchild = newRoot;
//        else if(node.parent != null)
//            node.parent.lchild = newRoot;
//        
//        newRoot.lchild = node;
//        node.parent = newRoot;
//                
//    }
//    
//    void inorder(Node root){
//        if(root==null)
//            return;
//        else{
//            inorder(root.lchild);
//            System.out.println(root.value +" " + root.color);
//            inorder(root.rchild);
//        }
//    }
//    void preorder(Node root){
//        if(root==null)
//            return;
//        else{
//            System.out.println(root.value +" " + root.color);
//            preorder(root.lchild);            
//            preorder(root.rchild);
//        }
//    }
//    void postorder(Node root){
//        if(root==null)
//            return;
//        else{            
//            postorder(root.lchild);            
//            postorder(root.rchild);
//            System.out.println(root.value +" " + root.color);
//        }
//    }    
//}
