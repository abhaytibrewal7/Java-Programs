package Trees;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryHeap<T> {
        
    public static void main(String[] args) {
        
        BinaryHeap<String>.HeapTree hp = new BinaryHeap<String>().new HeapTree();  //calling inner class
        
        hp.addNode(5, "ddday");
        hp.addNode(10, "ay");
        hp.addNode(6, "Aay");
        hp.addNode(12, "bhay");
        hp.addNode(7, "A");
        hp.addNode(18, "Ay");
        hp.addNode(20, "Abhkbdwkay");
        hp.addNode(1, "Abdh");
        hp.addNode(0, "hello");
        
        
        hp.printHeap();
        
        String max = hp.max();
        System.out.println("Maximum Element :"+max);
        
        hp.extractMax();
        
        hp.printHeap();
    }
    
    class Node{
        T data;
        int wt;        
    }
    
    class HeapTree{
        ArrayList<Node> allNode = new ArrayList<Node>();
        int size;
        void addNode(int wt,T data){                //ye heapify function h maintaining heap property
        
            Node newNode = new Node();
            newNode.data = data;
            newNode.wt = wt;
            allNode.add(newNode);
            size = allNode.size()-1;
            int currentIndex = size;            
            int parentIndex = (currentIndex - 1)/2;
            
            while(parentIndex >= 0){
                Node currentNode = allNode.get(currentIndex);
                Node parentNode = allNode.get(parentIndex);
                
                if(currentNode.wt > parentNode.wt){
                    swap(currentNode,parentNode);
                    currentIndex = parentIndex;
                    parentIndex = (currentIndex -1)/2;
                }
                else
                    break;
            }
        }
        
        void Heapify(int i){
            
            int leftIndex = 2*i+1;
            int rightIndex = 2*i +2;
            int largest;
            
            if(leftIndex > size)
                return;
            if(rightIndex > size)
                rightIndex = leftIndex;
            
            largest = allNode.get(leftIndex).wt >= allNode.get(rightIndex).wt ? leftIndex : rightIndex ;
            
            if(allNode.get(i).wt > allNode.get(largest).wt){
                largest = i;
            }
            if(largest != i){
                swap(allNode.get(i),allNode.get(largest));
                Heapify(largest);
            }
        }
        void swap(Node n1,Node n2){   //node ko jan bujh ke not transfering because usse related bahut data
            
            int wt = n1.wt;
            T data = n1.data;
            
            n1.data = n2.data;
            n1.wt = n2.wt;
            
            n2.data = data;
            n2.wt = wt;
            
//            Node temp = n1;
//            n1 = n2;
//            n2 = temp;
           
        }
        
        public T max(){
            return allNode.get(0).data;
        }
        
        public void extractMax(){
            
            swap(allNode.get(0),allNode.get(size));
            Node max = allNode.remove(size);
            
            Heapify(0);
            
            System.out.println("Maximum Element Extracted :"+ max.data + "  "+ max.wt);
        }
        
        public void printHeap(){
            for(Node node : allNode)
                System.out.println(node.data+" "+ node.wt);
        }
    }
}
